package src.leetcodeexplore.medium.dfs;

public class LongestZigZagPathInABinaryTree1372 {
  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(1);

    TreeNode t2 = new TreeNode(2);

    TreeNode t3 = new TreeNode(3);
    TreeNode t4 = new TreeNode(4);

    TreeNode t5 = new TreeNode(5);
    TreeNode t6 = new TreeNode(6);
    TreeNode t7 = new TreeNode(7);
    TreeNode t8 = new TreeNode(8);

    t1.right = t2;

    t2.left = t3;
    t2.right = t4;

    t4.left = t5;
    t4.right = t6;

    t5.right = t7;
    t7.right = t8;

  }


    int pathLength = 0;

    private void dfs(TreeNode node, boolean goLeft, int steps) {
      if (node == null) {
        return;
      }

      pathLength = Math.max(pathLength, steps);

      if (goLeft) {
        dfs(node.left, false, steps + 1);
        dfs(node.right, true, 1); // start new zigzag on each iteration
      } else {
        dfs(node.left, false, 1); // start new zigzag on each iteration
        dfs(node.right, true, steps + 1);
      }
    }

    public int longestZigZag(TreeNode root) {
      dfs(root, false, 0);
      dfs(root, true, 0);
      return pathLength;
    }

}
