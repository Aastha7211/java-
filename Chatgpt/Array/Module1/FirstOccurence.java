package Chatgpt.Array.Module1;

import java.util.Scanner;

public class FirstOccurence {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size if array");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("enter the element of array");
            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();
            }
            System.out.print("enter the number whose frist occurence index want: ");
            int x= sc.nextInt();

            int index = -1;

            for(int i=0;i<n;i++){
                if(arr[i]==x){
                    index=i;
                    break;

                }
            }

            System.out.print(index);


        }
    }


