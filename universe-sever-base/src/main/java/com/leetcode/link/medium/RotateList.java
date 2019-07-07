package com.leetcode.link.medium;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/7/7 22:14
 */
public class RotateList {
    public static void main(String[] args) {
        ListNode listNode = NodeListUtils.initNodeByIntArr(new int[]{1, 2, 3, 4, 5});
        ListNode result = rotateRight(listNode, 2);
        NodeListUtils.display(result);

    }

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode headNode = head;
        ListNode cur = head;
        ListNode tail = null;
        int n = 0;
        while (cur != null) {
            if (cur.next == null) {
                tail = cur;
            }
            cur = cur.next;
            n++;
        }
        tail.next = headNode;

        ListNode first = tail;
        for (int i = 0; i <  n - (k % n); i++) {
            first = first.next;
        }
        ListNode result = first.next;
        first.next = null;
        return result;
    }

}
