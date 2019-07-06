package com.leetcode.link.medium;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @author laiwenchao
 * @Classname Test3
 * @Description 两数之和
 * 输入
 * 2->4->3
 * 5->6->4
 * 输出
 * 7->0->8
 * @Date 2019-07-05 16:59
 */
public class Test3 {
    public static void main(String[] args) {
        ListNode listNode1 = NodeListUtils.initNodeByIntArr(new int[]{2, 4, 3});
        ListNode listNode2 = NodeListUtils.initNodeByIntArr(new int[]{5, 6, 4});
        ListNode listNode = sum(listNode1, listNode2);

        NodeListUtils.display(listNode);

    }

    public static ListNode sum(ListNode listNode1, ListNode listNode2) {

        ListNode cur = new ListNode(0);
        ListNode tmp = cur;
        ListNode p = listNode1;
        ListNode q = listNode2;
        int carry = 0;
        while (p != null || q != null) {
            int pnum = (p == null) ? 0 : p.val;
            int qnum = (q == null) ? 0 : q.val;
            int sum = carry + pnum + qnum;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }
        return tmp.next;
    }
}
