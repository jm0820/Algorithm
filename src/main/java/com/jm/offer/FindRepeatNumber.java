package com.jm.offer;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 题目描述
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 *
 * 限制
 * 2 <= n <= 100000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 */
public class FindRepeatNumber {
    public static void main(String[] args) {
        int array[] = {2, 3, 1, 0, 3, 5, 2};
        System.out.println(findRepeatNumber1(array));
        System.out.println(findRepeatNumber2(array));
    }

    /**
     * 网上的
     * 抓住这个信息："长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内"
     * 用数组下标作Key映射
     * 鸽巢原理
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber2(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[nums[i]]++;
            if (array[nums[i]] it> 1) return nums[i];
        }
        return -1;
    }


    /**
     * 暴力解法
     * @param nums
     * @return
     */
    public static int findRepeatNumber1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],0);
            }
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            if (map.get(key) > 0){
                return key;
            }
        }
        return -1;
    }
}
