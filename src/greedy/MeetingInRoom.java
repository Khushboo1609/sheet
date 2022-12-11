package greedy;

import java.util.ArrayList;
import java.util.Collections;

class Meeting  implements  Comparable<Meeting>
{
    int start;
    int end;
    int position;
    Meeting(int start,int end,int position)
    {
        this.start=start;
        this.end=end;
        this.position=position;
    }
    public int compareTo(Meeting o1)
    {
        if (this.end < o1.end)
            return -1;
        else if (this.end > o1.end)
            return 1;
        else if(this.position < o1.position)
            return -1;
        return 1; 
    }

    
}


public class MeetingInRoom 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int count =1;
        ArrayList<Meeting> res=new ArrayList<>();
        for(int i=0;i<start.length;i++)
        {
           Meeting m=new Meeting(start[i],end[i],i) ;
           res.add(m);
        }
        Collections.sort(res);
        int first=res.get(0).end;
        for(int i=0;i<res.size();i++)
        {
           if(res.get(i).start>first){
               count++;
               first = res.get(i).end;
           }
        }
        return count;
    }
}
