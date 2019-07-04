package com.leetcode.link.medium;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @author laiwenchao
 * @Classname Test2
 * @Description 删除链表倒数第N个节点
 * @Date 2019-07-04 20:01
 */
public class Test2 {

    public static void main(String[] args) {
        ListNode listNode = NodeListUtils.initNodeByIntArr(new int[]{5, 4, 3, 2, 1});
        ListNode head = deleteNodeLastN(listNode,3);
        NodeListUtils.display(head);
    }

    public static ListNode deleteNodeLastN(ListNode head, int num) {

        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < num; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode deleNode = slow.next;
        slow.next = deleNode.next;
        deleNode.next = null;
        return head;
    }
}
