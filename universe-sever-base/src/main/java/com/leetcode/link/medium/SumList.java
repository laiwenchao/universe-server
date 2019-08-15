package com.leetcode.link.medium;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @author laiwenchao
 * @Classname SameList
 * @Description 两数之和
 * 输入
 * 2->4->3
 * 5->6->4
 * 输出
 * 7->0->8
 * @Date 2019-07-05 16:59
 */
public class SumList {
    public static void main(String[] args) {
        ListNode listNode1 = NodeListUtils.initNodeByIntArr(new int[]{2, 4, 3});
        ListNode listNode2 = NodeListUtils.initNodeByIntArr(new int[]{5, 6, 4});
        ListNode r1 = sum(listNode1, listNode2);

        NodeListUtils.display(r1);

    }

    public static ListNode sum(ListNode l1, ListNode l2) {

        ListNode cur = new ListNode(0);
        ListNode result = cur;
        int carry = 0;
        while (l1 != null || l2 != null){
            int v1 = (l1 == null) ? 0 : l1.val;
            int v2 = (l2 == null) ? 0 : l2.val;
            int sum = v1 + v2 + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            cur = cur.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry != 0){
            cur.next = new ListNode(1);
        }
        return result.next;
    }

}
