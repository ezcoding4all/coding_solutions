/**
 * Reverse Link List II
 *
 * https://www.interviewbit.com/problems/reverse-link-list-ii/
 */
public class ReverseLinkList2 {
  public ListNode reverseBetween(ListNode a, int m, int n){
    ListNode newHead = new ListNode(-1);
    newHead.next = a;

    ListNode prev = newHead;

    for(int i = 0; i < m-1; i++){
      prev = prev.next;
    }

    ListNode reversedPrev = prev;

    // start from position m
    prev = prev.next;
    ListNode current = prev.next;

    for(int i = m; i < n; i++){
      prev.next = current.next;
      current.next = reversedPrev.next;
      reversedPrev.next = current;
      current = prev.next;
    }

    return newHead.next;
  }
}
