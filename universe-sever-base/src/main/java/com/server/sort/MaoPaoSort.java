package com.server.sort;


/**
 * @Author laiwenchao
 * @Description
 * @date 2019/9/3 22:03
 */
public class MaoPaoSort {
    public static void main(String[] args) {
        /*int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        selectSort(arr);
        System.out.println(JSON.toJSONString(arr));*/
    }

    /**
     * @Description 冒泡排序 {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48}
     * 每次遍历数组，前后两两对比，把大的值放到小值后面。每遍历一遍，最后一个数字不需要遍历
     * @author laiwenchao
     */
    public static void maoPaoSort(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length - i; j++) {
                if (j + 1 < integers.length - i && integers[j] > integers[j + 1]) {
                    int tmp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * @Description 选择排序 {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48}
     * 每次遍历一遍数组，取最小的数放到最前面，每遍历一遍，第一个数字不需要遍历
     * @author laiwenchao
     */
    public static void selectSort(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            int min = integers[i];//记录每次遍历最小的数
            int minIndex = i;//记录每次遍历最小的数的下表
            for (int j = i; j < integers.length; j++) {
                //每次遍历得到最小的数和其下标
                if (integers[j] < min) {
                    min = integers[j];
                    minIndex = j;
                }
            }
            //交换
            int tmp = integers[i];
            integers[i] = min;
            integers[minIndex] = tmp;
        }
    }

    /**
     * @Description 插入排序 {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48}
     * 扑克牌原理
     * @author laiwenchao
     */
    public static void insertSort(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            int cur = i;
            while (integers[i]<integers[--cur]){
                int tmp = integers[i];
            }
        }
    }


}
