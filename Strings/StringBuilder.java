package Strings;
//STRINGBUILDER EK TRAH KA ARRAYLIST JESA HOTA  HAI . ISME JAB HUM KUCH APPEND KARTE HAI TO NEW STRING NHAI BNATI
//BALKI USSI EXISTING STRING MAI APPEND HOTA HAU . YE MORE POWERFUL  STRING HHOTI HIA
//ISKI EK CAPACITY HOTI HIA  ACCORDING TO  NEED USKI  CAPACITY INCRESE YA DECRESE HOTI HAI.
import java.util.ArrayList;
public class StringBuilder {
    public StringBuilder(String s1) {
    }

    public static void main(String[] args){
        String s1="aastha";
        StringBuilder s= new StringBuilder(s1);
        System.out.println(s);
//        System.out.println(s1.length()+" "+s1.capcity());
        s.append("kushwaha");
//              System.out.println(s1);
//
    }
}
