package com.leetcode.link.medium;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/6/30 22:38
 */
public class Test1 {
    public static void main(String[] args) {
        ListNode listNode = NodeListUtils.initNodeByIntArr(new int[] {5,2,4,9,3,1});
        ListNode result = sortListNode(listNode);
        NodeListUtils.display(result);
    }

    public static ListNode sortListNode(ListNode head) {
        if(head.next == null){
            return head;
        }

        ListNode pre = null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;


        ListNode l1 = sortListNode(head);
        ListNode l2 = sortListNode(slow);
        NodeListUtils.display(l1);
        NodeListUtils.display(l2);
        ListNode result = merge(l1,l2);
        System.out.println("result");
        NodeListUtils.display(result);
        return result;
    }

    public static ListNode merge(ListNode l1,ListNode l2){

        ListNode cur = new ListNode(0);
        ListNode tmp = cur;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if(l1 == null){
            cur.next = l2;
        }else{
            cur.next = l1;
        }
        return tmp.next;
    }
}
