class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(0);
        int i = 0 , j = 0;
        while(i<n && j<n) {
            while(nums[i]<0) {
                i++;
            }
            ans.push_back(nums[i]);
            while(nums[j]>0) {
                j++;
            }
            ans.push_back(nums[j]);
            i++;
            j++;
        }
        return ans;
    }
};