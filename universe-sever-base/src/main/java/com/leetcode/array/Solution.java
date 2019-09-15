package com.leetcode.array;

import java.util.Arrays;

/**
 * @Author laiwenchao
 * @Description
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * @date 2019/8/4 23:18
 */
public class Solution {
    public static void main(String[] args) {

    }
    /**
     * @Description
     * 结果输出如下：
     * src源数组为：hellow
     * dest目标数组为：12345789
     * 复制完成之后的dest目标数组为：123hell9
     * @author laiwenchao
     * @date 2019/8/4 23:27
     * @param
     * @return void
    */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
