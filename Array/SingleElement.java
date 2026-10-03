package Array;

public class SingleElement {
    public static int singleNumber(int[] arr) {
        int xor = 0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {

            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        int ans = singleNumber(arr);
        System.out.print(ans);
    }
}


