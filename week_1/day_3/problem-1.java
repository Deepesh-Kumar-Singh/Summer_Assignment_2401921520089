# Detail -House Robber II
  class Solution {
    int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        dp = new int[n];
        Arrays.fill(dp, -1);
        int case1 = solve(nums, 0, n - 2);

        dp = new int[n];
        Arrays.fill(dp, -1);
        int case2 = solve(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int solve(int[] nums, int i, int end) {
        if (i > end) return 0;

        if (dp[i] != -1) return dp[i];

        int pick = nums[i] + solve(nums, i + 2, end);
        int skip = solve(nums, i + 1, end);

        return dp[i] = Math.max(pick, skip);
    }
}
