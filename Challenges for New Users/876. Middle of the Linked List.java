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
    public ListNode middleNode(ListNode head) {
        
        ListNode copy = head;
        ListNode res = head;
        int length = 0;
        
        while(copy!=null){
            copy = copy.next;
            length++;
        }
        
        for(int i = 0; i < length; i++){
            if(i < (length+1)/2){
                head = head.next;
            }
            else{
                res.val = head.val;
                head = head.next;
                res = res.next;
            }
        }
        
        return res;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
//Memory Usage: 40 MB, less than 87.41% of Java online submissions for Middle of the Linked List.
