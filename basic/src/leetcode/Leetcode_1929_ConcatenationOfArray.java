package leetcode;

public class Leetcode_1929_ConcatenationOfArray {
    //1929. Concatenation of Array

    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i%nums.length];
        }
        return ans;
    }
    // re
}
