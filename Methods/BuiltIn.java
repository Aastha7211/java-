package Methods;

import java.util.Scanner;

//MATHEMATICS BUILTIN  METHODS
public class BuiltIn {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        float n=sc.nextFloat();
        float m=sc.nextFloat();

        System.out.println(Math.max(m,n));
        System.out.println(Math.min(m,n));
        System.out.println(Math.abs(n));
        System.out.println(Math.sqrt(n));
        System.out.println(Math.cbrt(m));
        System.out.println(Math.round(n));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.ceil(m));
    }

}
