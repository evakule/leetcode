package old;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays2215 {
  public static void main(String[] args) {
    int[] array1 = new int[]{1, 2, 3};
    int[] array2 = new int[]{2, 4, 6};

    int[] array3 = new int[]{1, 2, 3, 3};
    int[] array4 = new int[]{1, 1, 2, 2};

    System.out.println(findDifference(array1, array2));
  }

  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> result = new ArrayList<>();

    Set<Integer> firstSet = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    Set<Integer> secondSet = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
    Set<Integer> firstSetDuplicated = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

    firstSet.removeAll(secondSet);
    secondSet.removeAll(firstSetDuplicated);

    result.add(new ArrayList<>(firstSet));
    result.add(new ArrayList<>(secondSet));

    return result;
  }
}
