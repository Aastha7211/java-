package Loops;

//public class CodeForce116 {
    import java.util.*;

    public class CodeForce116{
        public static void main(String[]args){
            Scanner sc=new Scanner (System.in);
            int n=sc.nextInt();
            int max=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                max=Math.max(max,x);

            }
            int seconds=0;
            while(max>0){
                max/=2;
                seconds++;
            }
            System.out.println(seconds);
        }
    }

