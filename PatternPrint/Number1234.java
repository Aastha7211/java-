package PatternPrint;

import java.util.Scanner;

public class Number1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the Number of colunms: ");
        int m = sc.nextInt();

        // for square just put j and i ==  n
        for (int i = 1; i <= n; i++) {  // n=3 how many lines are going to be there
            for (int j = 1; j <= m; j++) {  //m=4  how many stars are going to be in a line
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}

// for   111
//       222
//       333



//public class Number1234 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number of rows: ");
//        int n = sc.nextInt();
//        System.out.print("Enter the Number of colunms: ");
//        int m = sc.nextInt();
//
//        // for square just put j and i ==  n
//        for (int i = 1; i <= n; i++) {  // n=3 how many lines are going to be there
//            for (int j = 1; j <= m; j++) {  //m=4  how many stars are going to be in a line
//                System.out.print(i);
//            }
//            System.out.println(" ");
//        }
//    }
//}






