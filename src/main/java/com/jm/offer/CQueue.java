package com.jm.offer;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class CQueue {
    public int[] stack1;
    public int[] stack2;
    int p1,p2;
    public CQueue() {
        stack1 = new int[10000];
        stack2 = new int[10000];
        p1 = p2 = 0;
    }

    public void appendTail(int value) {
        if (p1 < 10000){
            stack1[p1++] = value;
        }
    }

    public int deleteHead() {
        if (p1 == 0){
            return -1;
        }
        while(p1 > 0) {
            stack2[p2++] = stack1[--p1];
        }
        int rst = stack2[--p2];
        while(p2 > 0) {
            stack1[p1++] = stack2[--p2];
        }

        return rst;
    }

    public static void main(String[] args) {
        CQueue queue = new CQueue();
        System.out.println(queue.deleteHead());
        queue.appendTail(5);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }
}
