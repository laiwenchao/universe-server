package com.leetcode.link.easy;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/6/30 21:46
 */
public class Test2 {
    public static void main(String[] args) {
        ListNode listNode1 = NodeListUtils.initNodeByIntArr(new int[]{1, 4, 6});
        ListNode listNode2 = NodeListUtils.initNodeByIntArr(new int[]{2, 3, 4, 7, 9});
        ListNode listNode = mergeTwoLists(listNode1, listNode2);
        NodeListUtils.display(listNode);
    }

    /**
     * @Description 链表合并
     * 示例：
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * @author laiwenchao
     * @date 2019/6/30 22:27
     * @param
     * @return com.leetcode.link.ListNode
    */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode cur = new ListNode(0);
        ListNode tmp = cur;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        ListNode result = tmp.next;
        tmp = null;
        return result;
    }
}
