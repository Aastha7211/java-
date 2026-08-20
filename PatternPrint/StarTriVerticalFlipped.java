package PatternPrint;

import java.util.Scanner;

public class StarTriVerticalFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++) {  // n=3 how many lines are going to be there
            for (int j = 1; j <=n-i; j++) {  //m=4  how many stars are going to be in a line
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


