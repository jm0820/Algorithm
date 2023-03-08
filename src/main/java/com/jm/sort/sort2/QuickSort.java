package com.jm.sort.sort2;

import java.util.Arrays;


/**
 * @author wjm
 * @date 2023/5/8 17:01
 * @Descript 快速排序
 * https://www.jianshu.com/p/6951551c7ecd
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {13,2,6,23,9,15};
        QuickSort quickSort = new QuickSort();
        System.out.println("before sort："+Arrays.toString(array));
        quickSort.sort1(array,0,array.length-1);
        System.out.println("after sort："+Arrays.toString(array));
    }


    /**
     *
     * @param array 待排序数组
     * @param start 开始下标
     * @param end 结束下标
     */
    public void sort1(int[] array,int start,int end){
        //找基准
        int par = partion(array,start,end);
        if(par > start){
            sort1(array,start,par-1);
        }
        if (par < end){
            sort1(array,par+1,end);
        }
    }


    /**
     * 找基准
     * @param array 数组
     * @param start 开始下标
     * @param end 结束下标
     * @return
     */
    private int partion(int[] array, int start, int end) {
        //默认使用初始位置为基准
        int tmp = array[start];
        while (start < end){
            while(start < end && array[end] > tmp){
                end--;
            }
            if (start >= end){
                break;
            }else {
                array[start] = array[end];
            }

            while (start < end && array[start] < tmp){
                start++;
            }
            if (start >= end){
                break;
            }else {
                array[end] = array[start];
            }
        }
        array[start] = tmp;
        return start;
    }
}
