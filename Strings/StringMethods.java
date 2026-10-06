package Strings;

import java.util.Scanner;

public class StringMethods {
    public   static  void main(String[] args){

        String s = "Aastha Kushwaha";

        // RETRIVING INDEX BY USING
        //charAt() function
        System.out.print(s.charAt(3));

         // RETRINVING THE INDEX UNSING CHACTER
        //indexOf() FIRST OCCURING CHARACTER INDEX
        System.out.println(s.indexOf('t'));

        // IT WILL GIVE THE LAST OCCURING INDEX OF CHARATER
        System.out.println(s.lastIndexOf('a'));

        //contains() USED TO CHECK WHETHER THE GIVEN SUBSTRING IS PRESENT IN THE STRING OR NOT
        System.out.println(s.contains("aas"));

        //startsWith() WHHETER STIRNG STARTS WITH PASSED STRING OR NOT
        System.out.println(s.startsWith("a"));




    }


    }


