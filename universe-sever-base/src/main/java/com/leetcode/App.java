package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/6/26 23:33
 */
public class App {
    private final static String name;

    static {
        name = "赖文超";
    }

    /*
     * @Description
     *  nums = [2, 7, 11, 15], target = 9
     * @author laiwenchao
     * @date 2019/9/14 22:13
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeElement(nums));;

    }

    public  static int removeElement(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }

    public int[] test(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                int index1 = map.get(target - nums[i]);
                return new int[]{index1, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
