package BinarySearch;

public class IterativeBinarySearch {


        public static int BinarySearch(int[]arr,int target) {
            int n = arr.length;
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid;
                }

                else if (arr[mid] > target){
                    high = mid - 1;
                }
                else{
                    low=mid+1;

                }

            }
            return  -1;
        }
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60};
            int target = 50;
            int result=BinarySearch(arr,target);
            System.out.print(result);

        }
    }
