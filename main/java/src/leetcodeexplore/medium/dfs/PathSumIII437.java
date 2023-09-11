package src.leetcodeexplore.medium.dfs;

import java.util.HashMap;

//leetcode solution of Path Sum III
public class PathSumIII437 {

  int count = 0;
  int k;
  HashMap<Long, Integer> map = new HashMap<>();

  public void preorder(TreeNode node, long currSum) {
    if (node == null) return;

    currSum = currSum + node.val;
    if (currSum == k)
      count++;


    count = count + map.getOrDefault(currSum - k, 0);

    map.put(currSum, map.getOrDefault(currSum, 0) + 1);


    preorder(node.left, currSum);
    preorder(node.right, currSum);

    map.put(currSum, map.get(currSum) - 1);
  }

  public int pathSum(TreeNode root, int targetSum) {
    k = targetSum;
    preorder(root, 0L);
    return count;
  }

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(3);

    TreeNode t2 = new TreeNode(1);
    TreeNode t3 = new TreeNode(4);

    TreeNode t4 = new TreeNode(3);
    TreeNode t5 = new TreeNode(-1);
    TreeNode t6 = new TreeNode(5);

//    [3,1,4,3,null,1,5]
    //      3
    //  1        4
    //3       -1    5
    t1.left = t2;
    t1.right = t3;

    t2.left = t4;

    t3.left = t5;
    t3.right = t6;
    PathSumIII437 pathSumIII437 = new PathSumIII437();

    int v = pathSumIII437.pathSum(t1, 7);
    System.out.println(v);
  }
}
