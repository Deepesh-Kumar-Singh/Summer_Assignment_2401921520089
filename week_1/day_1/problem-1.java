//Detail - Minimum Cost of Buying Candies With Discount
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        Stack<Integer> s=new Stack<>();
        for(int v:cost){
            s.push(v);
        }
        for(int i=1;i<=cost.length;i++){
            int v=s.pop();
            if(i%3==0){
                continue;
            }
            sum+=v;
        }
        return sum;
    }
}
