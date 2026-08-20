package Methods;
//we have to store the value of return type either in sop or varaible
public class ReturnType {
    public static  int cow(){
        System.out.println("mooo");
        return 4;
    }
    public static void main(String[] args){
        int x=cow();
        System.out.println(cow());
        System.out.println(3+x);
        //print moo and 4 as well because of the return type we has used
        //System.out.println();
              //  cow(); //only moo will return as output
    }
}
