package array;

import java.util.Arrays;

public class TwoSum  {
    public int[] twoSum(int[] num, int target) {
        int [] res= new int[2];
        Arrays.sort(num);
        int i=0;
        int j=num.length-1;
        while(i<j){


            if(num[i]+num[j]==target)
            {
                res[0]=num[i];
                res[1]=num[j];
                return res;

            }

            if(num[i]+num[j]>target)
            {
                j--;
            }

            else{
                i++;
            }

        }
        return  res;
    }
}
