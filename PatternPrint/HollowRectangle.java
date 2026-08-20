package PatternPrint;

import java.util.Scanner;

public class HollowRectangle {
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int n=sc.nextInt();
        System.out.print("Enter the Number of colunms: ");
        int m=sc.nextInt();

        for (int i=1;i<=n;i++){  // n=3 how many lines are going to be there
            for (int j=1;j<=m;j++){  //m=4  how many stars are going to be in a line
               if(i==1||i==n || j==1||j==m)
                   System.out.print("* ");
               else
                   System.out.print("# ");
                   //System.out.print(" ");  for hollow in between
               }
            System.out.println();
            }

        }
    }



