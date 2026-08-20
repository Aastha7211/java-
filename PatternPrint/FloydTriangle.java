package PatternPrint;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int n = sc.nextInt();
        int a=1;
        for (int i = 1; i<= n; i++) {  // n=3 how many lines are going to be there
            for (int j = 1; j <=i; j++) {
                       System.out.print(a+" ");
                a++;
            }
                   System.out.println();
            }
        }
    }




