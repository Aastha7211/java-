package Chatgpt.module1;

import java.util.Scanner;

public class ContainElementOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number you want to check: ");
        int x= sc.nextInt();

        boolean found = false;

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                found=true;
                break;

            }
        }
        if(found)
          System.out.print("Element Present in the array");
        else
            System.out.print("element is not present in the array");

    }
}



