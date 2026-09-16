package Array;

public class MissingNUmber {
    public static int missingNumber(int[] arr) {
        int arrsum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arrsum = arrsum + arr[i];
        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        int missing = sum - arrsum;

        return missing;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4,0};

        int result = missingNumber(arr);
        System.out.print(result);
    }
}


