package Array;

public class TwoSum {
    static boolean twoSum(int arr[], int tarrget) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; i < n; j++) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,5,-3,6};
        System.out.println(twoSum(arr,3));
    }
}


