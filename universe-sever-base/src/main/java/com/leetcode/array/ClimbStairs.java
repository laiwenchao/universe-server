package com.leetcode.array;

/**
 * @Author laiwenchao
 * @Description 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @date 2019/7/20 11:42
 */
public class ClimbStairs {
    public static void main(String[] args) {

    }

    public static int climbStairs(int n) {

        if(n == 1){
            return 1;
        }
        int [] dp = new int[n];//存储的时到第几个台阶用的方法数
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];

    }
}
