package Strings;

public class InterningNew {
    // THIS EQUAL  IS THE LOGIACL FUNNTION DON BY EQUALS()  METHOD, MEANS JO BHI LOGIC EQUALS()
    // METHOD KE PICHE HAI WO  HUMNE equals FUNTION MAI LIKHA HAI
//    public static boolean equals(String s1, String s2){
//        if(s1.length()!=s2.length()){
//            return false;}
//            for(int i=0;i<s1.length();i++){
//                if(s1.charAt(i)!=s2.charAt(i)){
//                    return false;
//                }
//            }
//
//        return  true;
//    }
    public static void main(String []args){
        String s1=new String("abc");
        String s2=new String("avc");
        System.out.println(s1.equals(s2));
    }
}
