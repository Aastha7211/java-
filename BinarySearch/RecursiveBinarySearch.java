package BinarySearch;



public  class RecursiveBinarySearch {
    public static int BinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return BinarySearch(arr,target,low,mid-1);
        } else {
            return BinarySearch(arr,target,mid+1,high);

        }

    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 50;
        int result= BinarySearch(arr, target , 0 , arr.length-1);
        System.out.print(result);

    }
}




