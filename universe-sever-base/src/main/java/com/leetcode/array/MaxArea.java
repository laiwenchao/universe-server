package com.leetcode.array;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/9/15 9:28
 */
public class MaxArea {
    public static void main(String[] args) {

    }

    /**
     * @return int
     * @Description 容器可容纳最多的水
     * @author laiwenchao
     * @date 2019/9/15 11:18
     */
    public int maxArea(int[] nums) {

        int r = nums.length - 1;
        int l = 0;
        int maxArea = 0;
        while (l < r) {
            maxArea = Math.max(maxArea, (r - l) * Math.min(nums[l], nums[r]));
            if (nums[l] < nums[r]) {
                l++;
            }else {
                r++;
            }
        }
        return maxArea;
    }
}
