package com.leetcode.link.medium;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

import java.util.List;

/**
 * @author laiwenchao
 * @Classname MergeList
 * @Description 删除链表倒数第N个节点
 * @Date 2019-07-04 20:01
 */
public class DeleteList {

    public static void main(String[] args) {
        ListNode listNode = NodeListUtils.initNodeByIntArr(new int[]{1});
        ListNode head = deleteNodeLastN(listNode, 1);
        NodeListUtils.display(head);
    }

    public static ListNode deleteNodeLastN(ListNode head, int n) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode result1 = head;
        ListNode result2 = head.next;

        ListNode pre = new ListNode(0);
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n - 1; i++) {
            fast = fast.next;
        }
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }

        ListNode deleNode = slow;
        pre.next = deleNode.next;
        deleNode.next = null;

        if(deleNode == head){
            return result2;
        }
        return result1;
    }
}
