package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
