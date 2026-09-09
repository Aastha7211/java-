package Chatgpt.Array.Module1;

import java.util.Scanner;

// with the help  of two pointers
//public class ReverseArr {
//    public static void main(String[] args){
//       int []arr={1,2,3,4,5};
//        int n=arr.length;
//        int left =0;
//        int right=n-1;
//          while(left<right){
//             int temp =arr[left];
//             arr[left]=arr[right];
//             arr[right]= temp;
//             left++;
//             right--;
//        }
//           for(int i=0;i<n;i++){
//               System.out.print(arr[i]+" ");
//           }
//    }
//}


// by using another array

//public class ReverseArr {
//    public static void main(String[] args){
//        int []arr1={1,2,3,4,5};
//        int[]arr2=new int[arr1.length];
//        int n=arr1.length;
//        int j=0;
//        for(int i=n-1;i>=0;i--){
//            arr2[j]=arr1[i];
//            j++;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr2[i]+" ");
//        }
//    }
//}

// REVERSE ONLY FIRST K ELEMENT

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter the first k element  which you want to reverse");
        int k = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = k - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}