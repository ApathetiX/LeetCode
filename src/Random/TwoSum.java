package Random;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];

        // we need to check each i index with the index after it
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int[] index = twoSum(nums, 6);

        for (int n : index) {
            System.out.print(n + " ");
        }
    }
}
