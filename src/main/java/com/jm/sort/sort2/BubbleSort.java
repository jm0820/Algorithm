package com.jm.sort.sort2;

import com.Util.RandomArray;

import javax.rmi.CORBA.Util;
import java.util.Arrays;

/**
 * @author wjm
 * @date 2023/5/9 9:53
 * @Descript 冒泡排序
 * https://zhuanlan.zhihu.com/p/122284534
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = RandomArray.getRandomArray(10, 101);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort1(array);
    }

    /**
     *
     * @param array
     */
    public void sort1(int[] array){
        System.out.println("排序前："+ Arrays.toString(array));
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length-i-1;j++){
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }

        }
        System.out.println("排序后："+ Arrays.toString(array));
    }
}
