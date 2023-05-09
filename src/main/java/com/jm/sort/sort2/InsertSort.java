package com.jm.sort.sort2;

import com.Util.RandomArray;
import com.jm.sort.sort2.InsertSort;


import java.util.Arrays;

/**
 * @author wjm
 * @date 2023/5/9 10:43
 * @Descript 直接插入排序
 * https://zhuanlan.zhihu.com/p/122293204
 */
public class InsertSort {
    public static void main(String[] args) {
        InsertSort insertsSort = new InsertSort();
        int[] array = RandomArray.getRandomArray(10, 101);
        insertsSort.sort1(array);
    }
    public void sort1(int[] array){
        System.out.println("排序前："+ Arrays.toString(array));
        for (int i = 1;i < array.length;i++){
            int tmp = array[i];
            int j;
            for (j = i-1;j >= 0;j--){
                if (array[j] > tmp){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
        System.out.println("排序后："+ Arrays.toString(array));
    }
}
