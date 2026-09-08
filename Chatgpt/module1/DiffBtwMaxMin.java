package Chatgpt.module1;

import java.util.Scanner;

public class DiffBtwMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int max= arr[0];
        int min = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];

            }
        }

        System.out.print("Difference between the maximum element and minimum element of array = " + (max-min));


    }
}



