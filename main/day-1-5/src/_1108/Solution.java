package src._1108;

import java.util.ArrayList;
import java.util.List;

/**
 * Defanging an IP Address
 */

class Solution {
  String defangingAnIPAddress(String address) {
    List<Character> listOfCharacters = getNumbers(address);
    return createNewIp(listOfCharacters);
  }

  private static List<Character> getNumbers(String ip) {
    List<Character> listOfNumbers = new ArrayList<>();
    for (int i = 0; i < ip.length(); i++) {
      char symbol = ip.charAt(i);
      listOfNumbers.add(symbol);
    }
    return listOfNumbers;
  }

  private static String createNewIp(List<Character> listOfNumbers) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < listOfNumbers.size(); i++) {
      if (listOfNumbers.get(i) != '.') {
        sb.append(listOfNumbers.get(i));
      } else {
        sb.append("[.]");
      }
    }
    return String.valueOf(sb);
  }
}
