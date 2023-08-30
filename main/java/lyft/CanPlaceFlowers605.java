package lyft;

public class CanPlaceFlowers605 {
  /**
   * Example 1:
   * Input: flowerbed = [1,0,0,0,1], n = 1
   * Output: true
   * <p>
   * Example 2:
   * Input: flowerbed = [1,0,0,0,1], n = 2
   * Output: false
   */
  public static void main(String[] args) {
    int[] flowerbed = new int[]{1, 0, 0, 0, 1};
    int adj = 2;
    System.out.println(canPlaceFlowers(flowerbed, adj));

  }

  //unsolved by me due to bad problem description (leetcode solution below)
  private static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 0;

    for (int i = 0; i < flowerbed.length; i++) {

      // Check if the current plot is empty.
      if (flowerbed[i] == 0) {
        // Check if the left and right plots are empty.
        boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
        boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

        // If both plots are empty, we can plant a flower here.
        if (emptyLeftPlot && emptyRightPlot) {
          flowerbed[i] = 1;
          count++;
        }
      }
    }
    return count >= n;


  }
}
