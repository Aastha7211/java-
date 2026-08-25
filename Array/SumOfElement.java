package Array;

import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter the element of array: ");
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            sum+=arr[i];
        System.out.print(sum+ " ");



    }
}