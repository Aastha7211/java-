package Chatgpt.Array.Module1;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }

    }
}


