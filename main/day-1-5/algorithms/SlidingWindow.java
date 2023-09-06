package algorithms;

public class SlidingWindow {
  int currSum = 0;
  int startIndex = 0;
  Integer maxSumRange = null;

  public int getMaxSumRange(int[] array) {
    for (int endIndex = 0; endIndex < array.length; endIndex++) {
      currSum += array[endIndex];

      if (maxSumRange == null || currSum > maxSumRange) {
        maxSumRange = currSum;
      }
      if (currSum < 0) {
        currSum = 0;
        startIndex = endIndex + 1;
      }
    }
    return maxSumRange;
  }

  public int getMaxSumRangeSimple(int[] array) {
    int currSum = 0;
    Integer maxSumRange = null;
    for (int number : array) {
      currSum += number;

      if (maxSumRange == null || currSum > maxSumRange) {
        maxSumRange = currSum;
      }
    }
    return maxSumRange;
  }
}

class Runner {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 10, -100, 10, 100};
    System.out.println(new SlidingWindow().getMaxSumRange(arr));
  }
}
