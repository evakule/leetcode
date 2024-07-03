package lyft;

import java.util.Arrays;

public class MedianOfTwoSortedArrays4 {
  public static void main(String[] args) {
    int[] first = new int[]{1, 1, 2, 3, 4};
    int[] second = new int[]{1, 1, 2, 6, 10};
    int[] res = new MedianOfTwoSortedArrays4().mergeSortedArrays(first, second);
    System.out.println(Arrays.toString(res));
    System.out.println(new MedianOfTwoSortedArrays4().findMedianSortedArrays(first, second));

  }

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] mergedArray = mergeSortedArrays(nums1, nums2);
    if (mergedArray.length % 2 != 0) {
      return mergedArray[mergedArray.length / 2];
    }
    double first = mergedArray[mergedArray.length / 2];
    double second = mergedArray[mergedArray.length / 2 - 1];
    return (first + second) / 2;

  }

  public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
    int len1 = arr1.length;
    int len2 = arr2.length;
    int[] mergedArray = new int[len1 + len2];

    int i = 0, j = 0, k = 0;

    while (i < len1 && j < len2) {
      if (arr1[i] < arr2[j]) {
        mergedArray[k++] = arr1[i++];
      } else {
        mergedArray[k++] = arr2[j++];
      }
    }

    while (i < len1) {
      mergedArray[k++] = arr1[i++];
    }

    while (j < len2) {
      mergedArray[k++] = arr2[j++];
    }

    return mergedArray;
  }

}
