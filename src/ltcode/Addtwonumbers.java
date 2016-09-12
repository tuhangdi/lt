package ltcode;
/**
 * Created by hd on 2016/8/16.
 */

/**
 * LeetCode #2
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x;next = null;}
 * }
 */
public class Addtwonumbers{
    public  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3=newHead;
        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }
        if(carry==1)
            p3.next=new ListNode(1);
        return newHead.next;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode t21 = new ListNode(4);
        ListNode t31 = new ListNode(3);
        l1.next = t21;
        t21.next = t31;
        ListNode l2 = new ListNode(5);
        ListNode t22 = new ListNode(6);
        ListNode t32 = new ListNode(3);
        l2.next = t22;
        t22.next = t32;
        System.out.println(addTwoNumbers(l1,l2));
    }
}
