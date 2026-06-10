 // WHILE 
 /*public class Loops {
    public static void main(String[] args) {
        int i=1; 
        while (i<=3) {
            System.out.println("hi"+i);
            int j=1;
            while (j<=3) {
                System.out.println("hello world");
                j++;
            }
            i++;
        }
    }
}*/
/* 
// DO WHILE
 public class Loops{
    public static void main(String[] args) {
        
        int i=1; 
        do
         {
            System.out.println("hi"+i);
            int j=1;
            do {
                System.out.println("hello world");
                j++;
            }while (j<=3);
            i++;
        } while (i<=3);
    }
} */

// for loop
/*public class Loops{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){

            System.out.println("hello");
        }
    }
}*/

//NESTED FFOR LOOP
public class Loops{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){

            System.out.println("DAY"+i);
             for(int j=1;j<9 ;j++){
                System.out.println("  "+(j+8)+ - + (j+9));
             }
        }
    }
}