package src.leetcodeexplore.medium.bfsgraphs;

import java.util.LinkedList;
import java.util.Queue;

public class BfsGraphAlgorithm {


  //TODO look at
  void search(Node root) {
    Queue<Node> queue = new LinkedList<>();
    root.visited = true;
    queue.add(root);

    while (!queue.isEmpty()) {
      Node node = queue.poll();
      visit(root);
      for (Node n : node.adjacent) {
        if (!n.visited) {
          n.visited = true;
          queue.add(n);
        }
      }
    }
  }

  private void visit(Node node) {
    System.out.println(node.val);
  }
}
