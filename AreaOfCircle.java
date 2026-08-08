import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double area= 4* 3.14 * r* r;
        System.out.print(area);
    }
}
