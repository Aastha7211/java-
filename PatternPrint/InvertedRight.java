package PatternPrint;

import java.util.Scanner;

public class InvertedRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n+1-i;j++){
                // or
                //for(int j=n;j>=i;j--)
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
 //   for(int i = 1; i <= n; i++) {
//            for(int j=1;j<=n;j++){
//            sop("*");
//            }
//              n--;/
//            System.out.print();