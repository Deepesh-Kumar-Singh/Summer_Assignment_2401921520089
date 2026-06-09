//Details-Find Greatest Common Divisor of Array
class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i: nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return gfd(1,max,min,0);
    }
    public int gfd(int i,int max,int min,int ans){
        if(i>min) return ans;
        if(max%i==0 && min%i==0){
            ans=i;
        }
        return gfd(i+1,max,min,ans);
    }
}
