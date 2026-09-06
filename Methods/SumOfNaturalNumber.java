package Methods;


import java.util.Scanner;

public class SumOfNaturalNumber {
    public static int FindSum(int n) {
        if (n == 0)
            return 0;
        else {
            int res = n * (n + 1);
            int result = res / 2;
            return result;
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(FindSum(n));
    }
}