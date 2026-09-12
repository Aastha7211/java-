package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static int firstoccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }


    public static int lastoccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] SearchElement(int[] nums, int target) {

        int first = firstoccurence(nums, target);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = lastoccurence(nums, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 5};
        int[] range = SearchElement(nums, 3);
        System.out.print(Arrays.toString(range));
    }
}
