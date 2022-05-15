package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_TwoSum_hash {
    // 1. Two Sum
    //  Input: nums = [2,7,11,15], target = 9
    //  Output: [0,1]
    //  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    public static void main(String[] args) {
        int[] nums = {2, 10, 1, 15};
        int target = 16;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        // hash table : n(o)
        // key: index number , value : values --> hash table
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // put nums, index number to map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // coparing to target
        // Using concept : a+b=target -->>> target-a=b
        for (int i = 0; i < nums.length; i++) {
            Integer remainder = map.get(target - nums[i]);
            if (remainder != null && remainder != i)
                return new int[]{i, remainder};
        }
        return null;
    }
}
