package com.leetcode.link;

/**
 * @Author laiwenchao
 * @Description
 * @date 2019/6/28 22:57
 */
public class SingleLinkedList {

    int size = 0;
    private ListNode head;

    public void addHead(ListNode listNode){
        if(head == null){
            head = listNode;
        }else{
            ListNode tmpHead = head;
            head = listNode;
            listNode.next = tmpHead;
        }
        size++;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void display(){
        if(head==null){
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while (current.next != null){
            if(current == head){
                sb.append("["+current.val + "->");
            }else{
                sb.append(current.val + "->");
            }
            current = current.next;
        }
        sb.append(current.val + "]");
        System.out.println(sb.toString());
    }
}
