package com.Util;

import java.util.Arrays;
import java.util.Random;

/**
 * @author wjm
 * @date 2023/5/9 10:11
 * @Descript 生成一个随机数组
 * https://zhuanlan.zhihu.com/p/380675389
 */
public class RandomArray {
    public static void main(String[] args) {
        getRandomArray(10,101);
    }

    /**
     *
     * @param len 数组长度
     * @param limit 数组范围
     * @return
     */
    public static int[] getRandomArray(int len,int limit){
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0;i < len;i++){
            array[i] = random.nextInt(limit);
        }
        System.out.println("生成数组："+ Arrays.toString(array));
        return array;
    }
}
