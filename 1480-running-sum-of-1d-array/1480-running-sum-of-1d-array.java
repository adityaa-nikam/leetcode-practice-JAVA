class Solution {
    int sum = 0;
    public int[] runningSum(int[] nums) {
        for ( int i = 1 ; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums ;
    }
}
