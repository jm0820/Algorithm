package com.jm.sort;

import java.util.Arrays;

/**
 * 冒泡排序法是两两交换
 * 通过分析冒泡排序的实现代码可以得知，该算法的最差时间复杂度为O(n2)，最优时间复杂度为O(n)，平均时间复杂度为 O(n2)。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        bubbleSort1(array);
        bubbleSort2(array);
    }

    /**
     * 普通的冒泡排序法
     * @param array
     */
    public static void bubbleSort1(int[] array){
        long start = System.currentTimeMillis();
        int temp = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = 0; j < array.length-1-i;j++){
                if (array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        long end  = System.currentTimeMillis();
        System.out.println("time:"+(end - start));
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort2(int[] array){
        long start = System.currentTimeMillis();
        int temp = 0;
        boolean flag = true;
        for (int i = 0;i < array.length && flag;i++){
            for (int j = 0; j < array.length-1-i;j++){
                flag = false;
                if (array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end - start));
        System.out.println(Arrays.toString(array));
    }
}
