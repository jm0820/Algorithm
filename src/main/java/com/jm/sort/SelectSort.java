package com.jm.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {23,3,22,5,6,1,16};
        System.out.println("排序前："+ Arrays.toString(array));
        selectSort(array);
        System.out.println("排序后："+ Arrays.toString(array));

        int[] array2 = {23,3,22,5,6,1,16};
        System.out.println("排序前："+ Arrays.toString(array2));
        selectSort2(array2);
        System.out.println("排序后："+ Arrays.toString(array2));
    }

    public static void selectSort(int[] array){
        for(int i = 0;i < array.length;i++){
            for(int j = i+1;j < array.length;j++){
                if (array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void selectSort2(int[] array){
        for(int i = 0;i < array.length;i++){
            int min = i;
            for(int j = i+1;j < array.length;j++){
                min = array[j] > array[min] ? min : j;
            }

            if(min != i){
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }
}