package com.leetcode.link;

/**
 * @Author laiwenchao
 * @Description 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * @date 2019/6/28 22:25
 */
public class Test1 {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead(new ListNode(5));
        singleLinkedList.addHead(new ListNode(4));
        singleLinkedList.addHead(new ListNode(3));
        singleLinkedList.addHead(new ListNode(2));
        singleLinkedList.addHead(new ListNode(1));



        ListNode newHead = reverseList(singleLinkedList.getHead());

        ListNode current = newHead;
        while (current!=null) {
            System.out.println(current.val);
            current = current.next;
        }

       /* SingleLinkedList single = new SingleLinkedList();
        single.setHead(newHead);
        single.display();*/
    }

    /**
     * 迭代方法
     * 1 -> 2 -> 3 -> 4 -> null
     * null <- 1 <- 2 <- 3 <- 4
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
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
