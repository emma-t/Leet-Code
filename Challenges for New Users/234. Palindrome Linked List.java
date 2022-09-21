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
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> stack = new Stack<>();
        ListNode copy = head;

        while(copy!= null){
            stack.push(copy.val);
            copy = copy.next;
        }
        
        copy = head;
        
        while(copy != null){
          if(stack.pop() != copy.val){
              return false;
          }
          copy = copy.next;
        }
        return true;  
      } 
}
