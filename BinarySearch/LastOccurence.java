package BinarySearch;

public class LastOccurence {
    public  static int lastoccurence(int[] nums, int target) {
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

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 40, 50};
        int target = 40;
        int index = lastoccurence(nums, target);
        System.out.print(index);
    }
}


