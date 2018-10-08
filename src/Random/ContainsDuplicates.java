package Random;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // put each number with its count in the map
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        // we need to get each value now
        // to check the occurrence
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // if any entry ISNT 1
            // then there are duplicates
            // and we return true
            if (entry.getValue() != 1) {
                return true;
            }
        }

        // if we came out of here, then we know there aren't any dups
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 5};

        System.out.println(containsDuplicate(nums));
    }
}
