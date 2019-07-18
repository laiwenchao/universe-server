package com.leetcode.array;

/**
 * @Author laiwenchao
 * @Description 去重后的数组长度
 * @date 2019/7/18 23:55
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int num = removeDuplicates(nums);
        System.out.println(num);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for (int j=1;j<nums.length;j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
