/**
 * Invert The Binary Tree
 *
 * https://www.interviewbit.com/problems/invert-the-binary-tree/
 */
public class InvertBinaryTree {

  public static void main(String[] args){


    TreeNode a = new TreeNode(4);
    a.left = new TreeNode(2);
    a.left.left = new TreeNode(1);
    a.left.right = new TreeNode(3);
    a.right = new TreeNode(7);
    a.right.left = new TreeNode(6);
    a.right.right = new TreeNode(9);

    InvertBinaryTree ib = new InvertBinaryTree();

    TreeNode result = ib.invertTree(a);
    System.out.println("");

  }

  public TreeNode invertTree(TreeNode root){

    if(root == null){
      return null;
    }

    // invert left
    TreeNode right = invertTree(root.right);
    // invert right
    TreeNode left = invertTree(root.left);

    root.left = right;
    root.right = left;

    return root;
  }
}
