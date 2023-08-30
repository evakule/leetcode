package src._70;

class Solution {
  public static int climbStairs(int n) {
    if (n == 1) return 1;
    int[] mem = new int[n];
    mem[0] = 1;
    mem[1] = 2;
    for (int i = 2; i < n; i++) {
      mem[i] = mem[i - 1] + mem[i - 2];
    }
    return mem[n - 1];
  }

  public static void main(String[] args) {
    System.out.println(climbStairs(2));
    System.out.println(climbStairs(6));
    System.out.println(climbStairs(7));
  }
}

// 7 -> 21
// 6 -> 13
// 5 -> 8
// 4 -> 5