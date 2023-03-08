package com.jm.sort;

import java.util.Arrays;

/**
 * https://www.cnblogs.com/E-Dreamer-Blogs/p/12944766.html
 * https://zhuanlan.zhihu.com/p/61100522
 * 快速排序
 * 时间复杂度
 * 平均情况：
 * 最坏情况：
 * 最好情况：
 *
 * 空间复杂度
 * 稳定性
 * 复杂性
 */
/**
 * 核心： partition 过程，  一个大于区和一个小于区和一个划分值，最初的划分值为数组的最后一位，小于区指针最初为 l-1，大于区指针为r。
 *
 * 逻辑： 1.当前值小于划分值时， 将小于区的下一位和当前值交换，小于区向右扩一个位置（less++）, 当前值跳下一个位置（l++）。
 *
 * 　　　 2.当前值大于划分值时， 将大于区的前一位和当前值交换，大于区向左扩一个位置（more--）。
 *
 * 　　　 3. 当前值等于划分值时，当前值直接跳下一个位置（l++）。
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4, 45, 23, 5, 5, 7};
        quick1(array);
        System.out.println("============================");
        int[] array2 = {4, 45, 23, 12, 5, 7};
        quick2(array2);
    }

    /**
     * 栈
     * @param array
     */
    public static void quick2(int[] array){
        System.out.println("排序前："+Arrays.toString(array));
        int[] stack = new int[array.length];
        int top = 0;
        int low = 0;
        int high = array.length-1;
        int par = partion(array,low,high);
        //入栈
        if (par > low+1){
            stack[top++] = low;
            stack[top++] = par - 1;
        }

        if (par < high-1){
            stack[top++] = par+1;
            stack[top++] = high;
        }
        while (top > 0){
            high = stack[--top];
            low = stack[--top];
            par = partion(array,low,high);
            if (par > low+1){
                stack[top++] = low;
                stack[top++] = par - 1;
            }

            if (par < high-1){
                stack[top++] = par+1;
                stack[top++] = high;
            }
        }
        System.out.println("排序后："+Arrays.toString(array));
    }

    /**
     * 递归法
     * 找基准
     * @param array
     */
    public static void quick1(int[] array){
        System.out.println("排序前："+Arrays.toString(array));
        quickSort1(array,0,array.length-1);
        System.out.println("排序后："+Arrays.toString(array));
    }

    /**
     * 快速排序全过程
     * @param array 待排序的数组
     * @param start 开始下标
     * @param end 结束下标
     */
    private static void quickSort1(int[] array, int start, int end) {
        //返回基准点
        int par = partion(array,start,end);
        int[] focus = focus(array, start, end, par, par - 1, par + 1);
        //对左边进行快速排序
        if (par > start+1){
            quickSort1(array,start,focus[0]);
        }
        // 对右边进行快速排序
        if (par < end-1){
            quickSort1(array, focus[1], end);
        }
    }

    /**
     * 一次快速排序，返回基准的位置
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partion(int[] array, int start, int end) {
        int tmp = array[start];
        while(start < end) {
            //从右边开始
            while (start < end && array[end] >= tmp) {
                --end;
            }
            if (start >= end) {
                break;
            } else {
                array[start] = array[end];
            }
            // 从 start 开始
            while (start < end && array[start] <= tmp) {
                ++start;
            }
            if (start >= end) {
                break;
            } else {
                array[end] = array[start];
            }
        }
        array[start] = tmp;
        return start;
    }


    //优化
    //1、聚集相同元素法

    /**
     *
     * @param array
     * @param start
     * @param end
     * @param par
     * @param left
     * @param right
     * @return
     */
    private static int[] focus(int[] array,int start,int end,int par,int left,int right){
        //聚集和基准元素相同的元素
        //左边找
        int parleft = par - 1;
        int parright = par + 1;
        for(int i = par-1; i >= start;i--){
            if (array[i] == array[par]){
                if (i != parleft){
                    swap(array,i,parleft);
                    parleft--;
                }else {
                    parleft--;
                }
            }
        }
        //右边找
        for (int i = par+1;i <= end;i++){
            if (array[i] == array[par]){
                if (i != parright){
                    swap(array,i,parright);
                    parright++;
                }else {
                    parright++;
                }
            }
        }
        int[] rst = {parleft,parright};
        return rst;
    }

    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

}
