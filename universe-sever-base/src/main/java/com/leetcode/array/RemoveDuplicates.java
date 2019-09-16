package com.leetcode.array;

import java.util.Arrays;

/**
 * @Author laiwenchao
 * @Description 去重后的数组长度
 * @date 2019/7/18 23:55
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        /*int[] nums = {1, 2, 3, 4, 5, 6};
        int num = removeDuplicates2(nums);*/
        int num=0;
        num++;
        System.out.println(num);
    }

    /**
     * @return int
     * @Author laiwenchao
     * @Description 有序数组，删除去重后的数组长度，不要使用额外的数组空间，
     * @Date 2019-09-15 13:40
     * @Param [nums]
     **/
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * @Author laiwenchao
     * @Description 给定一个排序数组，你需要在原地删除重复出现的元素，
     * 使得每个元素最多出现两次，返回移除后数组的新长度。
     *
     * @Date 2019-09-15 16:56
     * @Param [nums]
     * @return int
     **/
    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (i < 2 || nums[j] > nums[j - 2]) {
                nums[i] = nums[j];//移除重复元素
                i++;
            }
            System.out.println(i + ":" + j);
        }
        return i;
    }


    /**
     * @return int
     * @Author laiwenchao
     * @Description 删除指定元素，不要使用额外的数组空间
     * @Date 2019-09-15 13:41
     * @Param [nums, val]
     **/
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i + 1;
    }


}
