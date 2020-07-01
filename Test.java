给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
class Solution {
    public int findLength(int[] A, int[] B) {
        int ret=0;
        int m=A.length;
        int n=B.length;
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(A[i-1]==B[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    ret=Math.max(ret,dp[i][j]);
                }
            }
        }
        return ret;
    }
}