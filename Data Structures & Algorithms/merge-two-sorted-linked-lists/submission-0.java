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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = new ListNode();
        ListNode t = a;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                a.next = l1;
                l1 = l1.next;
            } else {
                a.next = l2;
                l2 = l2.next;
            }
            a=a.next;
        }
        if (l1 !=null)
            a.next = l1;
        if (l2 !=null)
            a.next = l2; 
        return t.next;
    }
}