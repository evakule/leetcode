package src.leetcodeexplore.medium.strings;

public class StringCompression443 {
  public static void main(String[] args) {

    System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));

  }

  //leetcode solution
  public static int compress(char[] chars) {
    int i = 0, res = 0;
    while (i < chars.length) {
      int groupLength = 1;
      while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
        groupLength++;
      }
      chars[res++] = chars[i];
      if (groupLength > 1) {
        for (char c : Integer.toString(groupLength).toCharArray()) {
          chars[res++] = c;
        }
      }
      i += groupLength;
    }
    return res;
  }


//  //My solution without updating input array
//  public static int compress(char[] chars) {
//    Map<Character, Integer> map = new HashMap<>();
//    List<String> cList = new ArrayList<>();
//
//    for (char aChar : chars) {
//      Integer counter = map.get(aChar);
//      if (counter == null) {
//        counter = 1;
//      } else {
//        counter++;
//      }
//      map.put(aChar, counter);
//    }
//
//    for (Map.Entry<Character, Integer> set : map.entrySet()) {
//      if (set.getValue() > 1) {
//        cList.add(set.getValue().toString());
//      }
//      cList.add(set.getKey().toString());
//    }
//    return cList.size();
//  }


}
