package com.server.soundcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author laiwenchao
 * @Classname MyArrayList
 * @Description
 * @Date 2019-08-22 19:56
 */
public class MyArrayList<E> {
    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * Shared empty array instance used for default sized empty instances. We
     * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
     * first element is added.
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * The array buffer into which the elements of the ArrayList are stored.
     * The capacity of the ArrayList is the length of this array buffer. Any
     * empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
     * will be expanded to DEFAULT_CAPACITY when the first element is added.
     */
    static transient Object[] elementData; // non-private to simplify nested class access

    /**
     * The size of the ArrayList (the number of elements it contains).
     *
     * @serial
     */
    private int size;

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    protected transient int modCount = 0;

    public MyArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        for(int i=0;i<11;i++){
            list.add("a");
        }
        new ArrayList<String>();

        System.out.println(list.size);
        System.out.println(elementData.length);

    }

    public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }

    private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
    }

    private static int calculateCapacity(Object[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        // 元素个数>数组大小时进行扩容
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {

        int oldCapacity = elementData.length;
        //数组扩容成，原数组长度的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        //第一次add()的时候会走这个逻辑，数组扩容成10 （0-10<0）
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        //扩容1.5倍后比MAX-8大，则判断（元素个数+1）> MAX-8 则为MAX, 否则为MAX-8
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        //扩容
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }
}
