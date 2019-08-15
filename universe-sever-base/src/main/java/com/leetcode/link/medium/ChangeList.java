package com.leetcode.link.medium;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

import java.util.List;

/**
 * @Author laiwenchao
 * @Description 输入：1->2->3->4
 * 输出：2->1->4->3
 * @date 2019/7/6 10:40
 */
public class ChangeList {
    public static void main(String[] args) {
        ListNode listNode = NodeListUtils.initNodeByIntArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        NodeListUtils.display(swapPairs(listNode));
    }

    /**
     * @Description
     *
     * 返回值：交换完成的子链表
     * 调用单元做了什么:设需要交换的两个点为 head 和 next，head 连接后面交换完成的子链表，next 连接 head，完成交换
     * 终止条件：head 为空指针或者 next 为空指针，也就是当前无节点或者只有一个节点，无法进行交换
     * @author laiwenchao
     * @date 2019/7/7 16:13
     * @param
     * @return com.leetcode.link.ListNode
    */
    public static ListNode swapPairs(ListNode head) {

        //终止条件
        if(head == null || head.next == null){
            return head;
        }
        ListNode nextTmp = head.next;
        ListNode nnTmp = head.next.next;
        nextTmp.next = head;
        head.next = swapPairs(nnTmp);
        return nextTmp;//返回值
    }

    public ListNode swap(ListNode head) {
        //终止条件
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;//返回值
    }
}
