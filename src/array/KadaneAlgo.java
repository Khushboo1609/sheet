package array;

public class KadaneAlgo {
    int kadane(int[] arr)
    {    int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum>max)
                max=sum;
            if(sum<0)
            {
                sum=0;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        KadaneAlgo ka=new KadaneAlgo();
        int result=ka.kadane(new int []{-2,-3,4,-1,-2,1,5,-3});
        System.out.println(result);
    }

}
