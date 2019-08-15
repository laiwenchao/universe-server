package com.leetcode.link.medium;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/7/7 23:50
 */
public class SortList {
    public static void main(String[] args) {
        ListNode listNode = NodeListUtils.initNodeByIntArr(new int[] {4,8,2,5,9,1,6});
        ListNode result = mergeSort(listNode);
        NodeListUtils.display(result);
    }

    public static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l1 = mergeSort(slow);
        ListNode l2 = mergeSort(fast);
        ListNode result = merge(l1, l2);
        return result;
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode result = cur;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return result.next;

    }
}
