package lyft;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {
  /**
   * Input: candies = [2,3,5,1,3], extraCandies = 3
   * Output: [true,true,true,false,true]
   */
  public static void main(String[] args) {
    int[] candies = new int[] {2,3,5,1,3};
    int extraCandies = 3;
    kidsWithCandies(candies, extraCandies).forEach(System.out::println);

  }

  private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int greatestNumber = 0;
    List<Boolean> resultList = new ArrayList<>();


    for (int candy : candies) {
      if (candy > greatestNumber) {
        greatestNumber = candy;
      }
    }
    for (int candy : candies) {
      if (candy + extraCandies >= greatestNumber) {
        resultList.add(true);
      } else {
        resultList.add(false);
      }
    }
    return resultList;
  }
}
