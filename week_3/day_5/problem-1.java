//Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        for(int i=1;i<gain.length;i++){
            gain[i]=gain[i]+gain[i-1];
        }
        int max=0;
        for(int v:gain){
            max=Math.max(v,max);
        }
        return max;
    }
}
