/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
		ListNode copy = head;
		while(copy.next!=null){
			if(copy.val==copy.next.val){
				copy.next=copy.next.next;
			}
			else{
				copy = copy.next;
			}
		}
        return head;
    }
}