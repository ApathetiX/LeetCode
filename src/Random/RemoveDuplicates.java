package Random;

public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums) {

        // we need to go thru the entire array and
        // check if the next point is the same as the one before it
        // if it is, we shift down

        int dups = 0;

        for (int i = 1; i < nums.length; i++) {
            // if i is equal to the ith before it
            // we need to shift down
            if (nums[i] == nums[i - 1]) {
                dups++;
                nums[i - dups] = nums[i];

            }
        }

        // when we're out of the loops, the entire array should be shifted down
        return nums.length - dups;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        System.out.println(removeDuplicates(nums));
    }
}
