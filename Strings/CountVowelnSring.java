package Strings;

public class CountVowelnSring {
    public static void main(String[] args) {
        String s = "EDUCATION";
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='A'||ch=='U'||ch=='E'|ch=='I'||ch=='O'){
                count++;

            }

        }
        System.out.print(count);

    }
}