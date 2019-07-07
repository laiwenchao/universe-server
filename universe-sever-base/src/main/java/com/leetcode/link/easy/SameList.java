package com.leetcode.link.easy;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @author laiwenchao
 * @Classname SameList
 * @Description 相交链表 返回共同元素
 * @Date 2019-07-04 18:33
 */
public class SameList {
    public static void main(String[] args) {
        ListNode listNode1 = NodeListUtils.initNodeByIntArr(new int[]{2, 3, 4, 7, 9});
        ListNode listNode2 = NodeListUtils.initNodeByIntArr(new int[]{1, 8, 7, 5, 6});
        ListNode result = sameNode(listNode1, listNode2);
        System.out.println(result);
    }

    /**
     * @return com.leetcode.link.ListNode
     * @Author laiwenchao
     * @Description 输入
     * 2->3->4->7->9
     * 1->8->7->5->6
     * 返回 7
     * @Date 2019-07-05 16:34
     * @Param [listNode1, listNode2]
     **/
    public static ListNode sameNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB){
            curA = curA != null ? curA.next : headB;
            curB = curB != null ? curB.next : headA;
        }
        return curA;
    }
}
