package com.leetcode.array;

/**
 * @Author laiwenchao
 * @Description
 *
 *  输入: [-2,1,-3,4,-1,2,1,-5,4],
 *  输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * @date 2019/7/20 10:46
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(arr);
        System.out.println(result);
    }

    public static int maxSubArray(int[] nums) {

        int res = nums[0];
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum >0){
                sum += nums[i];
            }else{
                sum = nums[i];
            }
            res = Math.max(sum,res);
        }
        return res;
    }
}
