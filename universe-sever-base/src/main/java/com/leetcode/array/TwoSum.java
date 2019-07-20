package com.leetcode.array;

import com.google.common.collect.Maps;

import java.util.*;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/7/18 23:13
 */
public class TwoSum {
    /**
     * @param
     * @return void
     * @Description 两数之和
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * @author laiwenchao
     * @date 2019/7/18 23:13
     */
    public static void main(String[] args) {
        /*int[] nums = {4, 8, 53, 6, 9, 3, 5};
        int[] result = towSum(nums, 7);
        System.out.println(result);*/

        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }

    public static int[] towSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                int n2 = map.get(value);

                return new int[]{i, n2};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    /**
     * @return
     * @Description 三数之和为0, 双指针解法
     * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     * <p>
     * 满足要求的三元组集合为：
     * [
     * [-1, 0, 1],
     * [-1, -1, 2]
     * ]
     * @author laiwenchao
     * @date 2019/9/15 12:21
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);//排序
        for (int i = 0; i < nums.length; i++) {
            //去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0) {
                break;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    //去重
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;

                } else if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                }
            }
        }
        return list;
    }
}
