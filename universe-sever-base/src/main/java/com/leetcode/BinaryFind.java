package com.leetcode;

/**
 * @author laiwenchao
 * @Classname BinaryFind
 * @Description
 * @Date 2019-09-15 19:28
 */
public class BinaryFind {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 3, 4, 7, 11, 16, 33, 43, 65, 77, 88, 90, 99, 110};
        int result = binaryFind(0, nums.length - 1, 3, nums);
        System.out.println(result);

    }

    /**
     * @return int
     * @Author laiwenchao
     * @Description 二分查找
     * @Date 2019-09-15 19:46
     * @Param [start, end, target, nums]
     **/
    public static int binaryFind(int start, int end, int target, int[] nums) {

        int mid = (start + end) / 2;
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return binaryFind(mid+1, end, target, nums);
        } else {
            return binaryFind(0, mid+1, target, nums);
        }

    }
}
