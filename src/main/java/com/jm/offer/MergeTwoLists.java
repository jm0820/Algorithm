package com.jm.offer;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 */
public class MergeTwoLists {
    public static void main(String[] args) {

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head,p;
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        //先确定头节点
        if(l1.val > l2.val){
            head = l2;
            l2 = l2.next;
        }else {
            head = l1;
            l1 = l1.next;
        }
        p = head;
        while (l1 !=null && l2 != null){
            if(l1.val > l2.val){
                p.next = l2;
                l2 = l2.next;
            }else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        if(l1 != null){
            p.next = l1;
        }else {
            p.next = l2;
        }
        return head;
    }
}
