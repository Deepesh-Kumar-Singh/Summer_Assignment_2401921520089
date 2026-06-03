// Min Cost Climbing Stairs
class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(mcost(0,cost),mcost(1,cost));
    }
    public int mcost(int i,int[] cost){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=cost[i]+Math.min(mcost(i+1,cost),mcost(i+2,cost));
        return dp[i];
    }

}
