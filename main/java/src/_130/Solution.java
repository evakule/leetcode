package src._130;

import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
    solve(board);

  }

  public static void solve(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      if (i != 0 && i != board.length - 1) {
        for (int j = 0; j < board[i].length; j++) {
          if (j != 0 && j != board[j].length - 1) {
            if (board[i][j] == 'O') {
              board[i][j] = 'X';
            }
          }
        }
      }
    }
  }
}
