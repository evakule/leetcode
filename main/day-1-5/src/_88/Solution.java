package src._88;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    int[] nums12 = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
    int[] nums21 = {1, 2, 2};
    merge(nums1, 3, nums2, 3);
    System.out.println(Arrays.toString(nums1));
  }

  public static void merge(int[] arr1, int n1, int[] arr2, int n2) {
    int i = 0, j = 0, k = 0;
    int[] arr3 = new int[n1 + n2];

    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j]) arr3[k++] = arr1[i++];
      else arr3[k++] = arr2[j++];
    }

    while (i < n1) arr3[k++] = arr1[i++];
    while (j < n2) arr3[k++] = arr2[j++];
  }

//  public static void merge(int[] nums1, int m, int[] nums2, int n) {
//    List<Integer> firstList = addArrayToList(nums1);
//    List<Integer> secondList = addArrayToList(nums2);
//    firstList.addAll(secondList);
//    List<Integer> updatedList = updateList(firstList);
//
//    nums1 = new int[updatedList.size()];
//    for (int i = 0; i < updatedList.size(); i++) {
//      nums1[i] = updatedList.get(i);
//    }
//    System.out.println(Arrays.toString(nums1));
//  }
//
//  public static List<Integer> addArrayToList(int[] nums) {
//    List<Integer> list = new ArrayList<>();
//    for (int a : nums) list.add(a);
//    return list;
//  }
//
//  public static List<Integer> updateList(List<Integer> list) {
//    Collections.sort(list);
//    return list.stream()
//            .filter(a -> a != 0)
//            .collect(Collectors.toList());
//  }
}
