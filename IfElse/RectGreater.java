package IfElse;

import java.util.Scanner;

public class RectGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF RECTANGLE:");
        int a = sc.nextInt();
        System.out.println("ENTER BREADTH OF RECTANGLE:");
        int b = sc.nextInt();
        sc.close();
        int area=a*b;
        int parameter=2*(a+b);
        if(area>parameter){
            System.out.print("Area is greater than parameter ");
        }
        else{
            System.out.print("Area is not greater than parameter ");
        }
    }
}
