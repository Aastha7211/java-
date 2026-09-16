package Array;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);

    }


    public static void reverse(int[] nums, int left, int right) {

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }


    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 34, 5, 6, 3};

       rotate(nums,3);
       System.out.print(Arrays.toString(nums));

   }}

