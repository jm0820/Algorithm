package com.jm.offer;

/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。
 *
 */
public class HammingWeight {

    public static void main(String[] args) {
        int rst = hammingWeight(11);
        System.out.println(rst);
    }

    public static int hammingWeight(int n) {
        int rst = 0;
        while(n != 0){
            rst += n & 1;
            n >>>= 1;
        }
        return rst;
    }

}
