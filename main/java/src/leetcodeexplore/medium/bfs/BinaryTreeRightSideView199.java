package src.leetcodeexplore.medium.bfs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView199 {
  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    TreeNode t3 = new TreeNode(3);
    TreeNode t4 = new TreeNode(4);
    TreeNode t5 = new TreeNode(5);
    TreeNode t6 = new TreeNode(6);
    TreeNode t7 = new TreeNode(7);
    TreeNode t8 = new TreeNode(8);
    TreeNode t9 = new TreeNode(9);
    TreeNode t10 = new TreeNode(10);
    TreeNode t11 = new TreeNode(11);
    TreeNode t12 = new TreeNode(12);
    TreeNode t13 = new TreeNode(13);
    TreeNode t14 = new TreeNode(14);
    TreeNode t15 = new TreeNode(15);

    t1.left = t2;
    t1.right = t3;

    t2.left = t4;
    t2.right = t5;
    t3.left = t6;
    t3.right = t7;

    t4.left = t8;
    t4.right = t9;
    t5.left = t10;
    t5.right = t11;
    t6.left = t12;
    t6.right = t13;
    t7.left = t14;
    t7.right = t15;




    rightSideView(t1).forEach(System.out::println);


  }

  //my solution after leetcode editorial view
  public static List<Integer> rightSideView(TreeNode root) {
    List<TreeNode> currStage = new ArrayList<>();
    List<Integer> search = new ArrayList<>();

    if (root != null) {
      currStage.add(root);
    }

    while (!currStage.isEmpty()) {
      List<TreeNode> nextStage = new ArrayList<>();

      int mostRightNodeIndex = currStage.size() - 1;
      TreeNode rightNode = currStage.get(mostRightNodeIndex);
      search.add(rightNode.val);

      for (TreeNode node : currStage) {
        if (node.left != null) nextStage.add(node.left);
        if (node.right != null) nextStage.add(node.right);
      }

      currStage = nextStage;

    }
    return search;
  }


}
