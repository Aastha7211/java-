package Array;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = {10, 34, 25, 46, 57};
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print("element found");
                break;
            }
        }
         if(i==arr.length){
            System.out.print("element not present");
        }

    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
