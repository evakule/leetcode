package src.leetcodeexplore.medium.bfsgraphs;

import java.util.ArrayList;
import java.util.List;

class Node {
  boolean visited = false;
  List<Node> adjacent = new ArrayList<>();
  int val;

  Node() {
  }

  Node(int val) {
    this.val = val;
  }

  Node(int val, boolean visited, List<Node> adjacent) {
    this.val = val;
    this.visited = visited;
    this.adjacent = adjacent;
  }
}

