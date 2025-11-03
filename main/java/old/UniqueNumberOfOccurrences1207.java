package old;

import java.util.*;

public class UniqueNumberOfOccurrences1207 {

  public static void main(String[] args) {
    int[] array1 = new int[]{1, 2, 2, 1, 1, 3};
    System.out.println(uniqueOccurrences(array1));

  }

  public static boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> occValueMap = new HashMap<>();

    for (int key : arr) {
      Integer keyCounter = occValueMap.get(key);
      if (keyCounter == null) {
        occValueMap.put(key, 1);
      } else {
        keyCounter = keyCounter + 1;
        occValueMap.put(key, keyCounter);
      }
    }

    List<Integer> occList = new ArrayList<>(occValueMap.values());
    Set<Integer> occSet = new HashSet<>(occValueMap.values());

    return occList.size() == occSet.size();
  }
}
