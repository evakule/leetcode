package algorithms;

import java.util.stream.IntStream;

public class BinarySearch {
  public static void main(String[] args) {
    int[] array = IntStream.range(1, 11).toArray();
    System.out.println(search(7, array));
  }

  public static int search(int key, int... array) {

    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = (high - low) / 2 + low;
      if (key < array[mid]) high = mid - 1;
      else if (key > array[mid]) low = mid + 1;
      else return mid;
    }
    return -1;
  }
}
