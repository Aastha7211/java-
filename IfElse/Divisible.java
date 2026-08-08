package IfElse;

import java.util.Scanner;

/*public class Divisible {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n%5==0) {
            System.out.println("number is divisilbe by 5");
        }
    }
}*/
//by 5 or 3
public class Divisible {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n%5==0||n%3==0) {
            System.out.println("number is divisilbe by 5  or 3");
        }
    }
}