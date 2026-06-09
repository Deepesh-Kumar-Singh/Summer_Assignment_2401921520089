// Details-Maximum Total Subarray Value I
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return k*(max-min);
    }
}
