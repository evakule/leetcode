package src.leetcodeexplore.medium.bfsgraphs;

public class DfsGraphAlgorithm {

  void search(Node root) {
    if (root == null) return;

    visit(root);
    root.visited = true;

    for (Node n : root.adjacent) {
      if (!n.visited) {
        search(n);
      }
    }
  }

  private void visit(Node node) {
    System.out.println(node.val);
  }

}
