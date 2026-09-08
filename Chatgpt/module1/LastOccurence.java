package Chatgpt.module1;

import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number whose last  occurence index want: ");
        int x= sc.nextInt();

        int index = -1;

        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                index=i;
                break;

            }
        }

        System.out.print(index);


    }
}



