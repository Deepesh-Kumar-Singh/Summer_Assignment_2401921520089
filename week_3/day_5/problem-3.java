// russian doll envelopes
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)-> a[0]!=b[0]?Integer.compare(a[0],b[0]):Integer.compare(b[1],a[1]));
        ArrayList<Integer> ans=new ArrayList<>();
        for(int[] a:envelopes){
            int v=a[1];
            if(ans.size()==0 || v>ans.get(ans.size()-1)) ans.add(v);
            else{
                replace(v,ans);
            }
        }
        return ans.size();
    }
    public void replace(int v,ArrayList<Integer> ans){
        int lo=0;
        int hi=ans.size()-1;
        int lb=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(ans.get(mid)>=v){
                lb=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        ans.set(lb,v);
    }
}
