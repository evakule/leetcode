import java.util.*;

public class InterviewMostFrequentElemInArray {
  public static void main(String[] args) {
    int[] array = new int[]{5, 5, 5, 5, 1, 1, 1, 1, 3, 3, 3, 2, 1};
    System.out.println(Arrays.toString(get(array, 3)));
  }

  public static int[] get(int[] array, int k) {
    int[] result = new int[k];
    Map<Integer, Integer> map = new HashMap<>();
    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

    for (int j : array) {
      map.put(j, map.getOrDefault(j, 0) + 1);
    }

    pq.addAll(map.entrySet());

    for (int i = k - 1; i >= 0; i--) {
      result[i] = Objects.requireNonNull(pq.poll()).getKey();
    }

    return result;
  }
}
