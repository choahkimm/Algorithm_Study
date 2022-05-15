package leetcode;

import java.util.Arrays;

public class Leetcode_TwoSum_twoPointers {
    // 1. Two Sum
    //  Input: nums = [2,7,11,15], target = 9
    //  Output: [0,1]
    //  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    public static void main(String[] args) {
        int[] nums = {2, 10, 1, 15};
        int target = 16;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // two pointers
        Arrays.sort(nums);
        int lp = 0;
        int rp = nums.length - 1;
        int result[] = new int[2];

        /*
                lp->
                [2 7 11 15]
                      <-rp
         */

        while(lp < rp) {
            int sum = nums[lp] + nums[rp];
            if(sum == target) {
                result[0] = lp;
                result[1] = rp;
                break;
            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return result;
    }


}
