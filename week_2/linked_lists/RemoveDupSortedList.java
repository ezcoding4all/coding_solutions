/**
 * Remove Duplicates from Sorted List
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDupSortedList {
  public static void main(String[] args){

    RemoveDupSortedList rm = new RemoveDupSortedList();

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;

    rm.deleteDuplicates(node1);

    System.out.println("Done");
  }

  public ListNode deleteDuplicates(ListNode a) {
    ListNode current = a;
    while(current.next != null){
      if(current.val == current.next.val){
        current.next = current.next.next;
      }else{
        current = current.next;
      }
    }

    return a;
  }
}
