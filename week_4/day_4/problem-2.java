//Count Subarrays With Majority Element I
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    c++;
                }

                int length = j - i + 1;

                if (2 * c > length) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
