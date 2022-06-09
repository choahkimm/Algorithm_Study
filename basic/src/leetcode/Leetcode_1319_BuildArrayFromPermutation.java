package leetcode;

public class Leetcode_1319_BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
//        Arrays.sort(nums);
//        return nums;
        int[] a=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            a[i]=nums[nums[i]];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        Leetcode_1319_BuildArrayFromPermutation lc = new Leetcode_1319_BuildArrayFromPermutation();
        lc.buildArray(nums);
        for(int i : nums){
            System.out.println(i);
        }
    }

}
