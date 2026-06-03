//Detail -Minimum Swaps to Move Zeros to End
class Solution {
    public int minimumSwaps(int[] nums) {
        int c=0;
        int c0=0;
        for(int v:nums){
            if(v==0){
                c0++;
            }
        }
        int a=1;
        while(c0>0){
            if(nums[nums.length-a]!=0){
                c++;
            }
            a++;
            c0--;
        }
        return c;
    }
}
