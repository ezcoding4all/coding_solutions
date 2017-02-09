import apple.laf.JRSUIUtils;

/**
 * Identical Binary Trees
 *
 * https://www.interviewbit.com/problems/identical-binary-trees/
 */
public class IdenticalBinaryTrees {

  public static void main(String[] args){

    TreeNode a = new TreeNode(2);
    //a.left = new TreeNode(2);
    //a.right = new TreeNode(3);

    TreeNode b = new TreeNode(1);
    //b.left = new TreeNode(2);
    //b.right = new TreeNode(4);

    IdenticalBinaryTrees ib = new IdenticalBinaryTrees();

    int result = ib.isSameTree(a, b);

    System.out.println(result);

  }

  public int isSameTree(TreeNode a, TreeNode b) {

    if(a == null && b == null){
      return 1;
    }

    if(a == null && b != null){
      return 0;
    }

    if(a != null && b == null){
      return 0;
    }

    if(a.val != b.val){
      return 0;
    }

    int leftResult = isSameTree(a.left, b.left);
    int rightResult = isSameTree(a.right, b.right);

    if(leftResult == 1 && rightResult == leftResult){
      return 1;
    }

    return 0;
  }
}
