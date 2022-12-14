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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstdig1 = 0;
        int firstdig2 = 0;
        int firstdig3 = 0;
        try {
            firstdig1 = l1.next.next.val;
            firstdig2 = l1.next.val;
            firstdig3 = l1.val;
        } catch (NullPointerException e) {
            // do nothing
        }
        int num1 = Integer.parseInt(firstdig1 + "" + firstdig2 + "" + firstdig3);

        int seconddig1 = 0;
        int seconddig2 = 0;
        int seconddig3 = 0;
        try {
            seconddig1 = l2.next.next.val;
            seconddig2 = l2.next.val;
            seconddig3 = l2.val;
        } catch (NullPointerException e) {
            // do nothing
        }
        int num2 = Integer.parseInt(seconddig1 + "" + seconddig2 + "" + seconddig3);

        int sum = num1 + num2;

        int thirdDigit = sum % 10;
        int secondDigit = (sum / 10) % 10;
        int firstDigit = (sum / 100) % 10;
        
        ListNode first = new ListNode(firstDigit);
        ListNode second = new ListNode(secondDigit, first);
        ListNode third = new ListNode(thirdDigit, second);
        if (third.val == 0) {
            return first;
        } else {
            return third;
        }
    }
}