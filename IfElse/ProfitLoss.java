package IfElse;

import java.util.Scanner;

public class ProfitLoss {
    public  static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER SP:");
        int sp=sc.nextInt();
        System.out.print("ENTER CP:");
        int cp=sc.nextInt();
        if(sp>cp)
        {
            System.out.print("profit");
        }
        else if(sp==cp)
             {System.out.print("neither loss nor profit");}
            else{
                System.out.print("loss");
            }
        }

    }

