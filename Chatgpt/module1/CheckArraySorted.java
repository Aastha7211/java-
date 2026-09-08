package Chatgpt.module1;

import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }


        boolean sorted =  true;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sorted =false;
                break;

            }
        }
        if(sorted)
            System.out.print(" sorted array");
        else
            System.out.print("unsorted array");

    }
}
