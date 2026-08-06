//greatest number in three
public class conditional {
    public static void main(String[] args) {
        int a = 3;
        int b=6;
        int c=8;
        if(a>b && a>c){
            System.out.println("greatest number "+a);
        }
        else if (b>a&&b>c){
            System.out.println("greatest number "+b);
        }
        else {
            System.out.println("greatest number "+c);
        }
    }
}
// evenodd
mport java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    if(n%2==0){
    System.out.print("Number is Even" +n);}
    else{
    System.out.print("Number is odd" +n);}
    }
}
