package src.leetcodeexplore.medium.dfs;

import java.util.*;

public class CountGoodNodesInBinaryTree1448 {
  public static void main(String[] args) {
//    TreeNode t1 = new TreeNode(3);
//
//    TreeNode t2 = new TreeNode(1);
//    TreeNode t3 = new TreeNode(4);
//
//    TreeNode t4 = new TreeNode(3);
//    TreeNode t5 = new TreeNode(1);
//    TreeNode t6 = new TreeNode(5);
//
////    [3,1,4,3,null,1,5]
//    t1.left = t2;
//    t1.right = t3;
//    t2.left = t4;
//
//    t3.left = t5;
//    t3.right = t6;

    TreeNode t1 = new TreeNode(2);
    TreeNode t2 = new TreeNode(4);
    TreeNode t3 = new TreeNode(10);
    TreeNode t4 = new TreeNode(8);
    TreeNode t5 = new TreeNode(4);

    t1.right = t2;
    t2.left = t3;
    t2.right = t4;
    t4.left = t5;


    System.out.println(goodNodes(t1));
  }

  //my solution
  public static int goodNodes(TreeNode root) {
    List<TreeNode> leaves = new ArrayList<>();
    check(root, root.val, leaves);
    return leaves.size();
  }

  private static void check(TreeNode current, int biggerValue, List<TreeNode> leaves) {
    if (current != null) {
      if (current.val >= biggerValue) {
        leaves.add(current);
        biggerValue = current.val;
      }
      check(current.left, biggerValue, leaves);
      check(current.right, biggerValue, leaves);

    }
  }

  //leetcode recursive solution
//  public static int goodNodes(TreeNode root) {
//    return countGoodNodes(root, root.val);
//  }
//
//  private static int countGoodNodes(TreeNode node, int biggest) {
//    int numOfGoodNodes = 0;
//
//    if (node != null) {
//      if (node.val >= biggest) {
//        biggest = node.val;
//        numOfGoodNodes++;
//      }
//      numOfGoodNodes += countGoodNodes(node.left, biggest);
//      numOfGoodNodes += countGoodNodes(node.right, biggest);
//
//    }
//
//    return numOfGoodNodes;
//  }

  //leetcode iterative solution
//  public static int goodNodes(TreeNode root) {
//    int goodNodes = 0;
//    Stack<NodeAndMax> stack = new Stack<>();
//    stack.push(new NodeAndMax(root, root.val));
//
//    while (!stack.isEmpty()) {
//      NodeAndMax nodeAndMax = stack.pop();
//      TreeNode current = nodeAndMax.node;
//      int biggest = nodeAndMax.biggest;
//
//      if (current.val >= biggest) {
//        biggest = current.val;
//        goodNodes++;
//      }
//      if (current.left != null) {
//        stack.push(new NodeAndMax(current.left, biggest));
//      }
//      if (current.right != null) {
//        stack.push(new NodeAndMax(current.right, biggest));
//      }
//    }
//    return goodNodes;
//  }
}

//class NodeAndMax {
//  public TreeNode node;
//  public int biggest;
//
//  public NodeAndMax(TreeNode node, int biggest) {
//    this.node = node;
//    this.biggest = biggest;
//  }
//}