package Methods;

public class Arguments {
    public static  void sum(int a,int b){
        System.out.println("sum of two number"+ " " +(a+b));}
    public static  void subtraction(int a,int b){
        System.out.println("subtraction of two numbers"+" " +(a-b));}

    public static  void main(String[] args){
        System.out.println("funtion call with argument");
        sum(3,5);
        subtraction(50,25);

    }
}

