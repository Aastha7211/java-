//multiply odd idexed with 2 and add even indexed with 10

package Array;

public class AddMultiply {
    public static void main(String[] args){
       // int i=0;
        int[]arr={1,2,3,4,5,6};
        for (int i=0;i<arr.length;i++){
           if (i%2==0) {
            arr[i] = arr[i] + 10;
           }

        else {
            arr[i] = arr[i] *2;

        }
        }
        print(arr);
}
        public static void print(int[]arr){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

