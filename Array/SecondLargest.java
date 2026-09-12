package Array;



public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 7, 2};
        int max = Integer.MIN_VALUE;
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                temp = max;
                max = arr[i];
            } else if

            (arr[i] > temp && arr[i] != max) {
                temp = arr[i];
            }
        }

            System.out.print(temp);

            }
        }




