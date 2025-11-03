package old;

public class IncreasingTripletSubsequence334 {
  public static void main(String[] args) {
    int[] first = new int[]{1, 2, 3, 4, 5};
    int[] second = new int[]{5, 4, 3, 2, 1};
    int[] third = new int[]{2, 1, 5, 0, 4, 6};
    int[] fourth = new int[]{20, 100, 10, 12, 5, 13};
    int[] fifth = new int[]{5, 1, 0, 4, 1, 3};

    System.out.println(increasingTriplet(fourth));

  }

//  //my Solution)
//  private static boolean increasingTriplet(int[] nums) {
//    Set<Integer> set = new HashSet<>();
//
//    for (int num : nums) {
//      set.add(num);
//    }
//
//    if (set.size() <= 2){
//      return false;
//    }
//
//    int min = nums[0];
//
//    for (int i = 0; i < nums.length; i++) {
//      if (nums[i] <= min) {
//        min = nums[i];
//
//        for (int j = i + 1; j < nums.length; j++) {
//          int latIndex = j + 1;
//          if (nums[j] > min) {
//            int mid = nums[j];
//
//            for (int k = latIndex; k < nums.length; k++) {
//
//              if (nums[k] < mid && nums[k] > min) {
//                mid = nums[k];
//              }
//
//              if (nums[k] > mid) {
//                return true;
//              }
//
//              if (k == nums.length - 1) {
//                latIndex = k;
//                break;
//              }
//
//            }
//          }
//          if (latIndex == nums.length - 1) break;
//        }
//      }
//    }
//    return false;
//  }

//  leetcode solution. Strange thing when debugging this -  20, 100, 10, 12, 5, 13
  private static boolean increasingTriplet(int[] nums) {
    int max1 = Integer.MAX_VALUE;
    int max2 = Integer.MAX_VALUE;
    for(int number : nums) {
      if(number <= max1) {
        max1 = number;
      } else if(number <= max2) {
        max2 = number;
      } else {
        return true;
      }
    }
    return false;
  }
}
