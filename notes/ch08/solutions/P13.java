package ch08.solutions;

import datatype.ListNode;

// P13. 팰린드롬 연결 리스트
// https://leetcode.com/problems/palindrome-linked-list/
public class P13 {
    public boolean isPalindrome(ListNode head) {
        // TODO: 직접 구현하기
        boolean ans = true;

        // two pointer
        ListNode slow = head;
        ListNode fast = head;

        // move
        while(!(fast==null || fast.next==null)){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse
        ListNode curr = slow, prev = null, post = null;
        while(curr != null){
            post = curr.next;
            curr.next= prev;
            prev = curr;
            curr = post;
        }

        // check Palindrome
        ListNode h1 = head;
        ListNode h2 = prev;
        while(h2 != null){
            if(h1.val != h2.val){
                ans = false;
                break;
            }
            else{
                h1=h1.next;
                h2=h2.next;
            }
        }
        return ans;
    }
}
