package BinarySearch;

public class BinarySearchWithoutFunction {


    public static void main(String[] args){
        int[]arr={10,20,30,40,50,60};
        int target=50;
        int n=arr.length;
        int low=0;
        int high= n-1;
        int index= -1;
       while(low<=high) {
           int mid = low + (high-low) / 2;

           if (arr[mid] == target) {
               index = mid;
               break;
           }
           else if (arr[mid] > target) {
               high= mid - 1;
           }
           else  {
               low= mid + 1;
           }

           }
            System.out.print( index);
        }
    }







