package Array;

import java.util.Scanner;

public class OutputInput {
    //    public static void main(String[] args){
//        int []arr={1,3,4,5,6,8};
//        //for (int i=0;i<=5;i++){
//            int n=arr.length;
//            for (int i=0;i<=n;i++){
//            System.out.print(arr[i]+" ");}
//        }
//}
//input from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i <= 5; i++) {
            int x = sc.nextInt();
        }
        for (int i = 0; i <= 5; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
