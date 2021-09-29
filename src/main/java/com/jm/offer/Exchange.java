package com.jm.offer;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 *  
 *
 * 示例：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 *
 */
public class Exchange {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] exchange = exchange(array);
        System.out.println(Arrays.toString(exchange));
    }

    public static int[] exchange(int[] nums) {
        int len = nums.length-1;
        int i = 0,j = len;
        while (i < j){
            int tmp;
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
