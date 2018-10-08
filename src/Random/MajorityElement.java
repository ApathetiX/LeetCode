package Random;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean greatest = false;

        // put each number in a hashmap
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int majority = 0;
        // now go thru each value in the map and check if it's greater
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }


}
