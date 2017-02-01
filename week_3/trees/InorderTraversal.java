import java.util.ArrayList;
import java.util.Stack;

/**
 * Inorder Traversal
 *
 * https://www.interviewbit.com/problems/inorder-traversal/
 */
public class InorderTraversal {
  public ArrayList<Integer> inorderTraversal(TreeNode a) {
    ArrayList<Integer> result = new ArrayList<>();

    if(a == null){ return null; }


    Stack<TreeNode> stack = new Stack<TreeNode>();

    while (true) {
      if (a != null) {
        stack.push(a);
        a = a.left;
      }else{
        if (stack.empty()) {
          break;
        }
        TreeNode current = stack.pop();
        result.add(current.val);
        a = current.right;
      }
    }

    return  result;
  }
}
