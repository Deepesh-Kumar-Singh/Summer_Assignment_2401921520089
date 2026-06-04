// Detail -Unique Paths
class Solution {
    static int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        return path(m,n);
    }
    public int path(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        dp[m][n]=path(m,n-1)+path(m-1,n);
        return dp[m][n];
    }
}
