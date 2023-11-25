package com.regis.twosum;

import java.util.HashMap;
import java.util.Map;

public class SolutionImpl implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        // input nums [2,7,11,15]
        // input target 9

        // <expected, index>
        Map<Integer, Integer> map = new HashMap<>();

        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                output[0] = map.get(nums[i]);
                output[1] = i;
                break;
            }

            map.put(target - nums[i], i);
        }

        return output;
    }

}
