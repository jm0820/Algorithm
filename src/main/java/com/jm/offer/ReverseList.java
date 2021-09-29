package com.jm.offer;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) { val = x; }
 }
public class ReverseList {
    public static void main(String[] args) {
        ListNode3 head = new ListNode3(1);
        head.next = new ListNode3(3);
        head.next.next = new ListNode3(5);
        head.next.next.next = new ListNode3(7);
        ListNode3 rstHead = reverseList(head);
        System.out.println(rstHead.val);
    }

    /**
     * 双指针解法
     * @param head
     * @return
     */
    public static ListNode3 reverseList(ListNode3 head) {
       ListNode3 cur = head,pre = null;
       while(cur != null){
           ListNode3 tmp = cur.next;
           cur.next = pre;
           pre = cur;
           cur = tmp;
       }
       return pre;
    }
}
