package src.leetcodeexplore.medium.dfs;


import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees872 {
  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);

    TreeNode t3 = new TreeNode(3);
    TreeNode t4 = new TreeNode(4);
    TreeNode t5 = new TreeNode(5);

    t1.left = t2;
    t1.right = t3;
    t3.left = t4;
    t3.right = t5;


  }

  //leetcode solution
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      List<Integer> first = new ArrayList<>();
      List<Integer> second = new ArrayList<>();
      search(root1, first);
      search(root2, second);
      return first.equals(second);
  }

  private void search(TreeNode node, List<Integer> list) {
    if (node != null) {
      if (node.left == null && node.right == null) {
        list.add(node.val);
      }
      search(node.left, list);
      search(node.right, list);
    }
  }


  private static void preOrderTraversal(TreeNode node) {
    if (node != null) {
      node.show();
      preOrderTraversal(node.left);
      preOrderTraversal(node.right);
    }
  }

  private static void inOrderTraversal(TreeNode node) {
    if (node != null) {
      preOrderTraversal(node.left);
      node.show();
      preOrderTraversal(node.right);
    }
  }

  private static void postOrderTraversal(TreeNode node) {
    if (node != null) {
      preOrderTraversal(node.left);
      preOrderTraversal(node.right);
      node.show();
    }
  }

}
