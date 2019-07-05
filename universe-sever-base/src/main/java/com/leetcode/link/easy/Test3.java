package com.leetcode.link.easy;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @author laiwenchao
 * @Classname Test3
 * @Description 相交链表 返回共同元素
 * @Date 2019-07-04 18:33
 */
public class Test3 {
    public static void main(String[] args) {
        ListNode listNode1 = NodeListUtils.initNodeByIntArr(new int[]{2, 3, 4, 7, 9});
        ListNode listNode2 = NodeListUtils.initNodeByIntArr(new int[]{1, 8, 7, 5, 6});
        ListNode result = sameNode(listNode1, listNode2);
        System.out.println(result.val);
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
    public static ListNode sameNode(ListNode listNode1, ListNode listNode2) {
        ListNode tmp = null;
        ListNode curNode1 = listNode1;
        while (curNode1 != null && tmp == null) {
            ListNode curNode2 = listNode2;
            while (curNode2 != null && tmp == null) {
                if (curNode1.val == curNode2.val) {
                    tmp = curNode1;
                }
                curNode2 = curNode2.next;
            }
            curNode1 = curNode1.next;
        }
        return tmp;
    }
}
