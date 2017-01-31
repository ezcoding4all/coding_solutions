/**
 * Add Two Numbers
 *
 * https://www.interviewbit.com/problems/add-two-numbers-as-lists/
 */
public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode a, ListNode b) {
    if(a == null || b == null){
      return null;
    }

    ListNode currentNode = null;
    ListNode resultNodeHead = null;

    int carry = 0;
    while(a != null || b != null){
      int sum = carry;

      if(a != null){
        sum = sum + a.val;
        a = a.next;
      }
      if(b != null){
        sum = sum + b.val;
        b = b.next;
      }

      int newNodeVal = sum%10;
      carry = sum/10;


      ListNode newNode = new ListNode(newNodeVal);
      if(currentNode == null){
        currentNode = newNode;
        resultNodeHead = newNode;
      }else{
        currentNode.next = newNode;
        currentNode = currentNode.next;
      }

    }

    if(carry > 0){
      ListNode newNode = new ListNode(carry);
      currentNode.next = newNode;
    }

    return resultNodeHead;
  }
}
