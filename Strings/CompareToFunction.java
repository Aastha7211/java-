package Strings;

public class CompareToFunction {
    public static void main(String[] args){
        String a="harshita";
        String b="harsh";
        String c="aastha";
        // will return the leftover characters of a
        System.out.println(a.compareTo(b));
        // will return the differnce between the asscii value of a and h
        System.out.println(a.compareTo(c));

    }
}
