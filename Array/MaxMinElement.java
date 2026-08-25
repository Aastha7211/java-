package Array;

public class MaxMinElement {
    public static void main(String[] args){

        int[]arr={1,4,5,6,7,23};
        int n=arr.length;
//        int max=arr[0];
//        for(int i=0;i<n;i++)
//            if(arr[i]>max)
//                max=arr[i];
//        System.out.print("Maximum element of array: "+" "+max);
//
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if (arr[i] > min)
                min = arr[i];
        }
        System.out.print(min);
    }
}
