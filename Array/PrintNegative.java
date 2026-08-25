package Array;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++) //input
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++) //print
            if (arr[i] < 0){
                System.out.print(arr[i] + " ");
        }
//            else{
//            System.out.print("No Negative value present");
//        }
    }
}

