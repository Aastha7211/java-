package Chatgpt.Array.Module1;

import java.util.Scanner;

public class AvgOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        int  sum = 0;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];}

            avg = (double) sum /n;

        System.out.print("average of array:" + avg);
    }
}
