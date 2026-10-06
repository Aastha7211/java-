package Strings;

public class PassingToMethod {
    public static void change(String s){
        s="aastha";
    }
    public static void main(String[] args){
        String x="kushwaha";
        System.out.println(x);
        change(x);
        System.out.print(x);
    }
}
