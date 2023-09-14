package src.leetcodeexplore.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * function backtrack(solution):
 *     if isComplete(solution):
 *         // We have found a complete solution
 *         processSolution(solution)
 *     else:
 *         candidates = generateCandidates(solution)
 *         for candidate in candidates:
 *             if isValid(candidate):
 *                 // Make a choice
 *                 makeChoice(candidate)
 *                 // Recursively explore further
 *                 backtrack(solution)
 *                 // Undo the choice (backtrack)
 *                 undoChoice(candidate)
 */

class BackTrackAlgo {
  private static final List<String> list = new ArrayList<>();
  char[] chars = new char[]{'A', 'B', 'C', 'D'};

  public static void main(String[] args) {
    BackTrackAlgo nQueens = new BackTrackAlgo();
    nQueens.solve();
    list.forEach(System.out::println);
  }



  public void solve() {
    backtrack(0, new StringBuilder());
  }

  private void backtrack(int counter, StringBuilder path) {
    if (counter == 2) {
      list.add(path.toString());
      return;
    }

    for (char person : chars) {
      if (person != 'D') {
        path.append(person);
        backtrack(counter + 1, path);
        path.deleteCharAt(path.length() - 1);
      }
    }

  }



}
