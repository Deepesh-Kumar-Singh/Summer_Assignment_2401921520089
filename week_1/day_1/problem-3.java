//Detail - Minimum Operations to Make Array Modulo Alternating I
class Solution {

    private int cost(int num, int targetRem, int k) {
        int rem = num % k;
        int diff = Math.abs(rem - targetRem);
        return Math.min(diff, k - diff);
    }

    public int minOperations(int[] nums, int k) {

        int ans = Integer.MAX_VALUE;

        for (int x = 0; x < k; x++) {
            for (int y = 0; y < k; y++) {

                if (x == y) continue;

                int cur = 0;

                for (int i = 0; i < nums.length; i++) {

                    if (i % 2 == 0) {
                        cur += cost(nums[i], x, k);
                    } else {
                        cur += cost(nums[i], y, k);
                    }
                }

                ans = Math.min(ans, cur);
            }
        }

        return ans;
    }
}
