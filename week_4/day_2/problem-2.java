//Valid Subarrays With Matching Sum Digits I
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int ans = 0;

        for (int start = 0; start < nums.length; start++) {
            long sum = 0;

            for (int end = start; end < nums.length; end++) {
                sum += nums[end];

                long last = sum % 10;

                long first = sum;
                while (first >= 10) {
                    first /= 10;
                }

                if (first == x && last == x) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
