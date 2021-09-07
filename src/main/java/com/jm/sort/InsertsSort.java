package com.jm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class InsertsSort {

    public static void main(String[] args) {
        int[] array = {15,7,3,89,21,43};
        System.out.println("排序前:"+Arrays.toString(array));
        insert(array);
        System.out.println("排序后："+Arrays.toString(array));
    }

    public static void insert(int[] array){
        for (int i = 1;i < array.length;i++){
            int j,temp = array[i];
            for (j = i-1;j >= 0;j--){
                if (array[j] > temp){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = temp;
        }
    }
}
