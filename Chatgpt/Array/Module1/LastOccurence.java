package Chatgpt.Array.Module1;
import java.util.*;
public class LastOccurence {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("enter the size of array: ");
            int n = sc.nextInt();

            System.out.print("enter the element of array: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int x = sc.nextInt();

            for (int i = n - 1; i >= 0; i++) {

                if (arr[i] == x) {
                    System.out.println(i);
                }
            }
        }
}




