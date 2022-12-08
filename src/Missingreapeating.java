import java.util.Arrays;

public class Missingreapeating {
    int[] missing(int[] arr) {
        Arrays.sort(arr);
        int duplicate = 0;
        int missing = 0;
        int n =arr.length;
        int sum=arr[n-1];
        for (int i = 0; i < arr.length-1; i++) {
            sum+=arr[i];
            if (arr[i] == arr[i + 1]) {
                duplicate = arr[i];
            }
        }
        missing = (n*(n+1)/2) - sum +  duplicate;
        return new int []{duplicate, missing};
    }

    public static void main(String[] args) {
       Missingreapeating missingreapeating = new Missingreapeating();
       int[] arr= new int[] {1,5,6,2,3,7,7};
       int [] arr1 = missingreapeating.missing(arr);
        System.out.println("duplicate :" + arr1[0] + ", missing :" + arr1[1]);
    }
}
