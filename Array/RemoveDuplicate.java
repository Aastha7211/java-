package Array;

public class RemoveDuplicate {
    public static int Duplicates(int[] arr, int n) {
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5};

        int result = Duplicates(arr, arr.length);
        System.out.println("Count of unique elements:");
        System.out.println(result);
        System.out.println("Array with  unique elements:");
        for (int k = 0; k < result; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}