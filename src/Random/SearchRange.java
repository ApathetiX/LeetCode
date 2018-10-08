package Random;

public class SearchRange {
    /**
     * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
     * Your algorithm's runtime complexity must be in the order of O(log n).
     * If the target is not found in the array, return [-1, -1].
     */


    // Input: nums = [5,7,7,8,8,10], target = 8
    // Output: [3,4]

    // Input: nums = [5,7,7,8,8,10], target = 6
    // Output: [-1,-1]

    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int[] {-1, -1};

        if (nums.length == 1)
            if (nums[0] == target)
            return new int[] {nums[0], -1};
        else return new int[] {-1, -1};

        int start = 0, end = nums.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                int[] result = checkNum(nums, mid, target);
                return result;
            }
            else if (nums[mid] < target)
                start = mid;
            else
                end = mid;
        }

        return new int[] {-1, -1};
    }

    private static int[] checkNum(int[] nums, int mid, int target) {
        // if we come to this method, we know the mid MUST be the target.
        // we need to check if mid + 1 is the target
        int[] array = new int[2];
        array[0] = mid;

        if (nums[mid + 1] == target) {
            array[1] = mid + 1;
        } else
            array[1] = -1;

        return array;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] result = searchRange(nums, 6);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
