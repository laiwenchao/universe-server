package com.leetcode.link.easy;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @Author laiwenchao
 * @Description 反转链表
 * @date 2019/6/30 21:46
 */
public class Test1 {
    public static void main(String[] args) {
        ListNode listNode = NodeListUtils.initNodeByIntArr(new int[]{5, 4, 3, 2, 1});

        ListNode newHead = reverseList(listNode);

        NodeListUtils.display(newHead);
    }

    /**
     * 迭代方法
     * 1 -> 2 -> 3 -> 4 -> null
     * null <- 1 <- 2 <- 3 <- 4
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTmp = current.next;
            current.next = pre;
            pre = current;
            current = nextTmp;
        }
        return pre;
    }
}
