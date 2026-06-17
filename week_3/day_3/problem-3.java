//Longest Increasing substring
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length+1];
        dp[0]=1;
        int maxlen=1;
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=1+max;
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}
