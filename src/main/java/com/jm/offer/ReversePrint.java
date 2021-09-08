package com.jm.offer;

/**
 * 逆序打印链表
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReversePrint {
 public static void main(String[] args) {


 }

 public int[] reversePrint(ListNode head) {
    if (head == null){
      return new int[0];
    }
    //1、遍历链表
    int len = 0;
    ListNode p = head;
    while(p.next != null){
         len++;
         p = p.next;
    }
    //2、设置数组长度
    int[] array = new int[len+1];
    //3、再次遍历链表
    while(head.next != null){
        array[len] = head.val;
        len--;
        head = head.next;
    }
    return array;
 }
}
