class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, ans=-10000;
        for(int i=0; i<nums.length; i++) {
            if (sum+nums[i] >= nums[i]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if(sum>ans)
                ans=sum;
        }
        return ans;
    }
}
