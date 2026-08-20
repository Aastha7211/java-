package Loops;

import java.util.Scanner;

public class EvenHundred{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number:");
            int n= sc.nextInt();
            for(int i=0;i<=n;i++ )
            {
                if(i%2==0) {
                    System.out.println(i);
                }
            }
        }
    }
//  second method
// for(int i=1; i<=sqrt n;i++){
//  if(n%i==0){
// system.out.print(i);
//}
