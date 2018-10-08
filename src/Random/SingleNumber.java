package Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -2};

        int num = singleNumber(nums);

        System.out.println(num);
    }
}
