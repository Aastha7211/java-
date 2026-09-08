package Chatgpt.Array.Module1;

import java.util.Scanner;

public class PrintAllElement {

    public static  void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the size if array");
        int n= sc.nextInt();
        int[]arr= new int[n];
        for (int i=0;i<n;i++)
        {
//            System.out.println("enter the element of array");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
                System.out.print(arr[i] + " ");
            }
        }
    }

