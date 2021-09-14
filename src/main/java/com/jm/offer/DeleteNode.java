package com.jm.offer;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
    }
}

public class DeleteNode {
    public static void main(String[] args) {

    }

    public ListNode1 deleteNode(ListNode1 head, int val) {
        ListNode1 p1 = head;
        if (head.val == val)
            return head.next;
        while(p1.next != null){
           if(p1.next.val == val){
               p1.next = p1.next.next;
           }else {
               p1 = p1.next;
           }
        }
        return head;
    }

}
