package IfElse;

import java.util.Scanner;

public class SideOfTriangle {
      public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          System.out.println("ENTER FIRST SIDE:");
          int a=sc.nextInt();
          System.out.println("ENTER SECOND SIDE:");
          int b=sc.nextInt();
          System.out.println("ENTER THIRD SIDE:");
          int c=sc.nextInt();
          if(a+b>c && b+c>a && c+a>b){
              System.out.print("triangle with these sides are possible");
          }
      }
}
