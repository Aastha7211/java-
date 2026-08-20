package Loops;

import java.util.Scanner;

public class PrimeOrNotPrime {
    public static void main(String[] args){
          Scanner sc  = new Scanner(System.in);
          int n=sc.nextInt();

          if(n%n==0 && n%1==0){
              System.out.println("number is prime");}
              else{
                  System.out.println("number is not prime");

              }
          }

    }

