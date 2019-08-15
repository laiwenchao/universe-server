package com.leetcode.array;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/7/18 23:13
 */
public class TwoSum {
    /**
     * @Description 两数之和
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * @author laiwenchao
     * @date 2019/7/18 23:13
     * @param
     * @return void
    */
    public static void main(String[] args) {
        int[] nums = {4,8,53,6,9,3,5};
        int[] result= towSum(nums,7);
        System.out.println(result);
    }

    public static int[] towSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            int value = target - nums[i];
            if(map.containsKey(value)) {
                int n2 = map.get(value);

                return new int[]{i,n2};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
