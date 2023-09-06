package lyft;

public class FindTheHighestAltitude1732 {

  public static void main(String[] args) {
    int[] array1 = new int[]{-5, 1, 5, 0, -7};
    System.out.println(largestAltitude(array1));
  }

  public static int largestAltitude(int[] gain) {
    int last = 0;
    int biggest = last;
    for (int j : gain) {
      last = last + j;
      if (last >= biggest) {
        biggest = last;
      }
    }
    return biggest;
  }
}
