/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode h) {

        ListNode t = h;
ListNode p =null;
        while(h!=null){
            t = h.next;
            h.next=p;
            p=h;
            h=t;
        }
        return p;
    }
}
