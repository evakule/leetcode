package algorithms;

import java.util.stream.IntStream;

class BS2 {

  public static void main(String[] args) {

    int[] array = IntStream.range(1, 11).toArray();
    System.out.println(rank(7, array, 0, array.length - 1));
  }

  public static int rank(int search, int[] array, int low, int high) {
    if (low > high) return -1;
    int mid = (high - low) / 2 + low;
    if (search < array[mid]) return rank(search, array, low, mid - 1);
    else if (search > array[mid]) return rank(search, array, mid + 1, high);
    else return mid;
  }
}
