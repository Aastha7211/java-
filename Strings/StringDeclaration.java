package Strings;

import java.util.Scanner;

public class StringDeclaration {
    public  static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        String s1= sc.nextLine(); // it will print the whole sentence
        System.out.print(s1);
        String s2= sc.next();// it will break the sentence when it encounters the space.
        System.out.print(s2);
    }
}
