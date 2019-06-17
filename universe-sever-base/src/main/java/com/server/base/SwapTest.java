package com.server.base;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/3/25 下午4:03
 */
public class SwapTest {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        System.out.println(a + ":" + b);
        swap(a, b);
        System.out.println(a + ":" + b);

        int aa = 1;
        int bb = 2;
        int[] arr = {aa, bb};
        System.out.println(arr[0] + ":" + arr[1]);
        swapSuccess(arr, 0, 1);
        System.out.println(arr[0] + ":" + arr[1]);
        System.out.println("===========================");


        int c = 1;
        int d = 2;
        System.out.println(c + ":" + d);
        swap(c, d);
        System.out.println(c + ":" + d);

        System.out.println("===========================");

        Integer aa1 = 12700;
        System.out.println(aa1);
    }

    public static void swap(int a, int b) {
        Integer temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void swap(Integer a, Integer b) {
        Integer temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void swapSuccess(int[] arr, int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
