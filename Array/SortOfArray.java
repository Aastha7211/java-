package Array;
import java.util.Arrays;
public class SortOfArray {
    public static void main(String[] args) {
       System.out.print("Array before sort:"+" ");
        int[] arr = {1, 4, 5, 10, 7, 2};
        print(arr);
       System.out.print("Array after sorting:"+" ");
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
