package com.leetcode.link.utils;

import com.leetcode.link.ListNode;
import com.leetcode.link.SingleLinkedList;
import org.w3c.dom.NodeList;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/6/30 21:49
 */
public class NodeListUtils {

    public static void display(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while (current.next != null) {
            if (current == head) {
                sb.append("[" + current.val + "->");
            } else {
                sb.append(current.val + "->");
            }
            current = current.next;
        }
        sb.append(current.val + "]");
        System.out.println(sb.toString());
    }

    public static void easyPrint(ListNode head) {
        ListNode current = head;
        while (current!=null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode initNodeByIntArr(int [] initInt){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        ListNode cur = null;
        for(int value : initInt){
            cur = new ListNode(value);
            singleLinkedList.addHead(cur);
        }
        return reverse(cur);
    }

    /**
     * @Description 反转链表,返回反转后的链表头
     * @author laiwenchao
     * @date 2019/6/30 21:58
     * @param
     * @return void
    */
    public static ListNode reverse(ListNode head){
        if(head == null){
            throw new RuntimeException("参数不能为空");
        }
        ListNode pre = null;
        ListNode current = head;
        while (current != null){
            ListNode nextTmp = current.next;
            current.next = pre;
            pre = current;
            current = nextTmp;
        }
        return pre;
    }
}
