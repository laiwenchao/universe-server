package com.leetcode.dynamic;

import java.util.LinkedHashMap;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/9/13 0:10
 */
public class App {
    /**
     * @Description
     * 1、考虑dp:到这个方格的总步数；
     * 2、考虑边界：上下边界的取值范围
     * 3、考虑中间方格：dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
     * @author laiwenchao
     * @date 2019/9/13 1:15
    */
    public static void main(String[] args) {
        int[][] grid = new int[1][3];
        int m = grid.length;
        int n = grid[0].length;
        System.out.println(m);
        System.out.println(n);
    }

    /**
     * @param
     * @return int
     * @Description
     * 求左上角到右下角的路径总数
     * 对于第一行 dp[0][j]，或者第一列 dp[i][0]，由于都是在边界，所以只能为 1
     * 动态方程：dp[i][j] = dp[i-1][j] + dp[i][j-1]
     * @author laiwenchao
     * @date 2019/9/13 0:13
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }

    /**
     * @param
     * @return int
     * @Description 爬楼梯有几种方式
     * @author laiwenchao
     * @date 2019/9/13 0:49
     */
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n-1];
    }

    /**
     * @Description
     * 输入:
     * [
     *   [1,3,1],
     *   [1,5,1],
     *   [4,2,1]
     * ]
     * 输出: 7
     * 解释: 因为路径 1→3→1→1→1 的总和最小。
     * @author laiwenchao
     * @date 2019/9/13 1:16
     * @return int
    */
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i=1;i<m;i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int i=1;i<n;i++){
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m][n];
    }
}
