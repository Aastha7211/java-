package Strings;

public class PalindromString  {
    static boolean isPalindrom(String s){
    int i=0;
    int j=s.length()-1;
    while(i<=j) {
        if(s.charAt(i)==s.charAt(j)){
            return  true;

        }
        return false;
    }
        return isPalindrom(s);
    }

    public static  void main(String[] args){

         boolean result=isPalindrom("abacaba");

         System.out.print(result);
    }
}
