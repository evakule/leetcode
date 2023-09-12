package src.leetcodeexplore.medium.bfs;

import java.util.*;

public class MaximumLevelSumOfABinaryTree1161 {
  public static void main(String[] args) {
//    TreeNode t1 = new TreeNode(1);
//    TreeNode t2 = new TreeNode(2);
//    TreeNode t3 = new TreeNode(3);
//    TreeNode t4 = new TreeNode(4);
//    TreeNode t5 = new TreeNode(5);
//    TreeNode t6 = new TreeNode(6);
//    TreeNode t7 = new TreeNode(7);
//    TreeNode t8 = new TreeNode(8);
//    TreeNode t9 = new TreeNode(9);
//    TreeNode t10 = new TreeNode(10);
//    TreeNode t11 = new TreeNode(11);
//    TreeNode t12 = new TreeNode(12);
//    TreeNode t13 = new TreeNode(13);
//    TreeNode t14 = new TreeNode(14);
//    TreeNode t15 = new TreeNode(15);
//
//    t1.left = t2;
//    t1.right = t3;
//
//    t2.left = t4;
//    t2.right = t5;
//    t3.left = t6;
//    t3.right = t7;
//
//    t4.left = t8;
//    t4.right = t9;
//    t5.left = t10;
//    t5.right = t11;
//    t6.left = t12;
//    t6.right = t13;
//    t7.left = t14;
//    t7.right = t15;

    TreeNode t1 = new TreeNode(989);
    TreeNode t2 = new TreeNode(10250);
    TreeNode t3 = new TreeNode(98693);
    TreeNode t4 = new TreeNode(-89388);
    TreeNode t5 = new TreeNode(-32127);

    t1.right = t2;
    t2.left = t3;
    t2.right = t4;
    t4.right = t5;


    System.out.println(maxLevelSum(t1));

  }
  public static int maxLevelSum(TreeNode root) {
    List<TreeNode> currentStage = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    int currSum;
    int level = 1;

    if (root != null) {
      currentStage.add(root);
      currSum = root.val;
      map.put(level, currSum);
    }

    while (!currentStage.isEmpty()) {
      List<TreeNode> nextStage = new ArrayList<>();

      for (TreeNode node : currentStage) {
        if (node.left != null) nextStage.add(node.left);
        if (node.right != null) nextStage.add(node.right);
      }

      if (!nextStage.isEmpty()) {
        currSum = nextStage.stream().mapToInt(x -> x.val).sum();
        level++;
        map.put(level, currSum);
      }

      currentStage = nextStage;
    }

    return getBiggestLevel(map);
  }

  private static int getBiggestLevel(Map<Integer, Integer> hashMap) {
    int biggestLevel = 1;
    int biggestValue = hashMap.get(biggestLevel);
    for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
      if (entry.getValue() > biggestValue) {
        biggestLevel = entry.getKey();
        biggestValue = entry.getValue();
      }
    }
    return biggestLevel;
  }

    //leetcode solution
//  public int maxLevelSum(TreeNode root) {
//    int maxSum = Integer.MIN_VALUE;
//    int ans = 0, level = 0;
//
//    Queue<TreeNode> q = new LinkedList<>();
//    q.offer(root);
//
//    while (!q.isEmpty()) {
//      level++;
//      int sumAtCurrentLevel = 0;
//      // Iterate over all the nodes in the current level.
//      for (int sz = q.size(); sz > 0; --sz) {
//        TreeNode node = q.poll();
//        sumAtCurrentLevel += node.val;
//
//        if (node.left != null) {
//          q.offer(node.left);
//        }
//        if (node.right != null) {
//          q.offer(node.right);
//        }
//      }
//
//      if (maxSum < sumAtCurrentLevel) {
//        maxSum = sumAtCurrentLevel;
//        ans = level;
//      }
//    }
//
//    return ans;
//  }
}
