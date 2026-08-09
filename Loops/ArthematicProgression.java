package Loops;

//import java.util.Scanner;
//
//public class ArthematicProgression {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number:");
//        int n= sc.nextInt();
//        for(int i=2;i<=3*n-1;i=i+3){ // isme baar baar har ap ke liye condition
//                                    // badlni  padegi jo ki optimal code nhi hai
//            System.out.println(i);
//        }
//    }
//}
import java.util.Scanner;

public class ArthematicProgression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        int a=2,d=3;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            a+=d;
        }
    }
}




