package src.leetcodeexplore.medium.dfs;

public class MaximumDepthOfBinaryTree104 {
  public static void main(String[] args) {

    TreeNode t1 = new TreeNode(3);
    TreeNode t2 = new TreeNode(9);

    TreeNode t3 = new TreeNode(20);
    TreeNode t4 = new TreeNode(15);
    TreeNode t5 = new TreeNode(7);

    t1.left = t2;
    t1.right = t3;
    t3.left = t4;
    t3.right = t5;

    System.out.println(maxDepth(t1));

  }

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    } else {
      int maxLeftDepth = maxDepth(root.left) + 1;
      int maxRightDepth = maxDepth(root.right) + 1;
      return Math.max(maxLeftDepth, maxRightDepth);
    }
  }
//  leetcode solution
//  public int maxDepth(TreeNode root) {
//    LinkedList<TreeNode> stack = new LinkedList<>();
//    LinkedList<Integer> depths = new LinkedList<>();
//    if (root == null) return 0;
//
//    stack.add(root);
//    depths.add(1);
//
//    int depth = 0, current_depth = 0;
//    while(!stack.isEmpty()) {
//      root = stack.pollLast();
//      current_depth = depths.pollLast();
//      if (root != null) {
//        depth = Math.max(depth, current_depth);
//        stack.add(root.left);
//        stack.add(root.right);
//        depths.add(current_depth + 1);
//        depths.add(current_depth + 1);
//      }
//    }
//    return depth;
//  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  void show() {
    System.out.println(val);
  }
}
