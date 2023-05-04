package com.sj.learning.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] array = new int[]{4,1,2,2,1};
        System.out.println(singleNumber(array));
    }
    public static int singleNumberMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            if (map.get(nums[i]) != null)
                map.remove(nums[i]);
            else
                map.put(nums[i], 1);
        }
        return map.keySet().iterator().next();
    }


    public static int singleNumber(int[] nums) {
        int xor= 0;
        for (int num: nums) {
            xor ^= num;
        }
        return xor;
    }
}
