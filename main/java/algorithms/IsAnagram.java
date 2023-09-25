package algorithms;

public class IsAnagram {
  public static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }

    int[] letters = new int[256];

    for (char c : a.toCharArray()) {
      System.out.println(letters[c]);
      letters[c]++;
    }

    for (char c : b.toCharArray()) {
      System.out.println(letters[c]);
      letters[c]--;
    }

    for (int i : letters) {
      if (i != 0) {
        return false;
      }
    }
    return true;
  }
}
