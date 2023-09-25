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

  //using TreeSet instead of PriorityQueue (worse than PQ)
  public static int[] get2(int[] array, int k) {
    int[] result = new int[k];
    Map<Integer, Integer> map = new HashMap<>();
    TreeSet<Map.Entry<Integer, Integer>> treeSet = new TreeSet<>(
        (a, b) -> {
          int cmp = b.getValue().compareTo(a.getValue());
          return cmp != 0 ? cmp : a.getKey().compareTo(b.getKey());
        }
    );

    for (int j : array) {
      map.put(j, map.getOrDefault(j, 0) + 1);
    }

    treeSet.addAll(map.entrySet());

    int i = 0;
    for (Map.Entry<Integer, Integer> entry : treeSet) {
      result[i++] = entry.getKey();
      if (i == k) break;
    }

    return result;
  }

}
