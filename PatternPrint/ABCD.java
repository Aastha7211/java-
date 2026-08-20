package PatternPrint;

import javax.swing.colorchooser.ColorChooserComponentFactory;
import java.util.Scanner;

public class ABCD {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
    int n = sc.nextInt();
//        System.out.print("Enter the Number of colunms: ");
//    int m = sc.nextInt();

        for (int i = 1; i<= n; i++) {  // n=3 how many lines are going to be there
        for (char ch = 'A'; ch <= 'D'; ch++) {  //m=4  how many stars are going to be in a line
            // for (int j=1; j<=m; j++){
               // sop((char)(j+64)+ " ")
            System.out.print(ch);

        }
        System.out.println(" ");
    }
}
}

//  for output
//             a b c
//             a b c

// for (int j=1; j<=m; j++){
// sop((char)(j+96)+ " ")  }


// for      AAA
//          BBB
//          CCC


//for (int i = 1; i<= n; i++){
//   for (int j=1; j<=m; j++){
// sop((char)(i+64)+ " ")  }
//        }