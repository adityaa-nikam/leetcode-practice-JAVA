class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
        max=Math.max(max,(long)nums[i]);
        min=Math.min(min,(long)nums[i]);
        }
        return (max-min)*k;
    }
}