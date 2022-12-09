package array;

public class Dutchflag {
    int[] sort(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while (mid <= end) {
            if (arr[mid] == 0) {
                int temp = 0;
                temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                mid++;
                start++;
            }
            if (arr[mid] == 1) {
                mid++;
            }
            if (arr[mid] == 2) {
                int temp = 0;
                temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;

                end--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Dutchflag d = new Dutchflag();
        int[] result = d.sort(new int[]{1, 1, 0, 2, 2});
        int[] res = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            res[i] = result[i];
            System.out.println(res[i]);
        }

    }
}
