package IfElse;

import java.util.Scanner;

public class BestCard {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
       if(x%y==0 && y%x==0){
           System.out.println(Math.min(x,y));
       }
       else{
           System.out.println(Math.max(x,y));
       }
    }
}
