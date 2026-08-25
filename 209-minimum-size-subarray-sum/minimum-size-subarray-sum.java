class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                int val=right-left+1;
                if(ans>val)ans=val;
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return ans != Integer.MAX_VALUE ? ans : 0;
    }
}