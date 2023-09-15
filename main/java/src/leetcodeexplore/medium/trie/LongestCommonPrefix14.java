package src.leetcodeexplore.medium.trie;

public class LongestCommonPrefix14 {
  public static void main(String[] args) {
    String[] array = new String[]{"flow","flower","flight"};
    LongestCommonPrefix14 obj = new LongestCommonPrefix14();

    System.out.println(obj.longestCommonPrefix(array));
  }

  //my solution
//  public String longestCommonPrefix(String[] strs) {
//    if (strs.length == 1) return strs[0];
//
//    StringBuilder sb = new StringBuilder();
//    TreeNode trie = new TreeNode();
//
//    for (String item : strs) {
//      trie.insert(item);
//    }
//
//    while (trie.children != null && trie.children.size() == 1) {
//      sb.append(trie.value);
//      trie = trie.children.get(0);
//    }
//    sb.append(trie.value);
//
//    return sb.toString().trim();
//  }

  //leetcode solution
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    }
    return prefix;
  }
}
