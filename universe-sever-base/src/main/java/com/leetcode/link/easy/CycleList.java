package com.leetcode.link.easy;

import com.leetcode.link.ListNode;
import com.leetcode.link.utils.NodeListUtils;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/7/7 19:41
 */
public class CycleList {

    public static void main(String[] args) {

    }

    public boolean cycleList(ListNode head){
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

}
