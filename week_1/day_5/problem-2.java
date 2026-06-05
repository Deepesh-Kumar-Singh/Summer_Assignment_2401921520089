//  friends pairing 
class Solution {
  public int countfriens(int n){
    int [] dp=new int[n+1];
    return friend(n,dp);
  }
  public int friend(int n,int[] dp){
    if(n<=2){
      return n;
    }
    if(dp[n]!=0){
      return dp[i];
    }
    return dp[i]=friend(n-1,dp)+(n-1)friend(n-2,dp);
  }
}
