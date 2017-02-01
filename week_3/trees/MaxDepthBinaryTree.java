/**
 * Max Depth Of Binary Tree
 *
 * https://www.interviewbit.com/problems/max-depth-of-binary-tree/
 */
public class MaxDepthBinaryTree {

  public int maxDepth(TreeNode a) {
    int leftHeight = 0, rightHeight = 0;

    if(a == null){ return 0; }

    if (a.left != null) {
      leftHeight = maxDepth(a.left);
    }

    if (a.right != null) {
      rightHeight = maxDepth(a.right);
    }

    int height = Math.max(leftHeight, rightHeight) + 1;

    return height;
  }

}
