package com.jm.offer;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * 限制：
 * 0 <= s 的长度 <= 10000
 *
 * 官方解题思路：
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/solution/cshuang-100dong-hua-zhan-shi-xiang-xi-zhu-shi-by-c/
 *
 * 其它拓展：
 * Java 中单引号和双引号的区别：https://zhidao.baidu.com/question/126686411.html
 *
 * leetcode 地址：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/submissions/
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace1(s));
    }

    /**
     * 使用 java 的数据类型
     * @param s
     * @return
     */
    public static String replaceSpace1(String s) {
        StringBuilder builder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' '){
                builder.append("%20");
            }else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    public String replaceSpace2(String s) {
        int n = s.length();
        char[] newArr = new char[3 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                newArr[j++] = '%';
                newArr[j++] = '2';
                newArr[j++] = '0';
            } else {
                newArr[j++] = c;
            }
        }
        return new String(newArr, 0, j);
    }

    public String replaceSpace3(String s) {
        int n = s.length();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') cnt++;
        }
        char[] newArr = new char[n + 2 * cnt];
        int j = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                newArr[j++] = '%';
                newArr[j++] = '2';
                newArr[j++] = '0';
            } else {
                newArr[j++] = c;
            }
        }
        return new String(newArr);
    }

}