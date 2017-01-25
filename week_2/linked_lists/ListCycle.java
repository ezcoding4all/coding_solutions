/**
 * List Cycle
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * 1 -> 2 -> 3 -> 4 ---> 3
 * return node of value 3
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/list-cycle/
 */
public class ListCycle {

  public static void main(String[] args){

    ListCycle lc = new ListCycle();

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);


    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = null;

    ListNode result = lc.detectCycle(node1);


    System.out.println(""+result.val);
  }

  public ListNode detectCycle(ListNode a) {
    ListNode p1=a, p2=a, head=a;

    while (p2.next != null){

      if(p2.next.next == null){
        break;
      }

      p1 = p1.next;
      p2 = p2.next.next;

      if(p1.equals(p2)){
        while (!p1.equals(head)){
          p1 = p1.next;
          head = head.next;
        }
        return head;
      }
    }

    return null;
  }

}
