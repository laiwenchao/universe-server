package com.leetcode.array;

/**
 * @Author laiwenchao
 * @Description 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * @date 2019/7/20 10:46
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(arr);
        System.out.println(result);
        /*int[] arr = {-2, 1, -3, 4, -1, 20, 1, -5, 4};
        int result = maxSubArray(arr);
        int result1 = maxSubArray1(arr);
        System.out.println(result);
        System.out.println(result1);*/
    }

    public static int maxSubArray1(int[] nums) {

        // 在每一个扫描点计算以该点数值为结束点的子数列的最大和（正数和）。
        int beforeMax = nums[0];
        int curentMax = nums[0];

        for (int i = 1; i < nums.length; i ++ ) {
            // 以每个位置为终点的最大子数列 都是基于其前一位置的最大子数列计算得出,
            beforeMax = Math.max (beforeMax + nums[i],nums[i]);
            curentMax = Math.max ( beforeMax, curentMax);
        }

        return curentMax;

    }

    public static int maxSubArray(int[] nums) {

        int res = nums[0];
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}
