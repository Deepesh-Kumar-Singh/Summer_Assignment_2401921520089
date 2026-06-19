//Longest Increasing Subsequence
class Solution {
    static int lis(int arr[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int v:arr){
            if(ans.size()==0 || v>ans.get(ans.size()-1)){
                ans.add(v);
            }
            else{
                replace(v,ans);
            }
        }
        return ans.size();
    }
    public static void replace(int v,ArrayList<Integer> ans){
        int lo=0;
        int hi=ans.size()-1;
        int lw=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(ans.get(mid)>=v){
                lw=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
            
        }
        ans.set(lw,v);
    }
}
