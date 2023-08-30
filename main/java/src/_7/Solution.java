package src._7;

class Solution {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.reverse(1234567891));
  }


  private int reverse(int x) {
    int rev = 0;
    while (x != 0) {
      if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;
      rev = rev * 10 + (x % 10);
      x = x / 10;
    }
    return rev;
  }
}