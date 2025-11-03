package old;

public class StringToIntegerAtoi8 {
  public static void main(String[] args) {
    StringToIntegerAtoi8 r = new StringToIntegerAtoi8();
    print(r.myAtoi("2147483646"));

  }

  public int myAtoi(String s) {
    String input = s.trim();

    if (input.isEmpty()) {
      return 0;
    }

    int sign = 1;
    int index = 0;
    int result = 0;

    if (input.charAt(0) == '-') {
      sign = -1;
      index++;
    } else if (input.charAt(0) == '+') {
      index++;
    }

    while (index < input.length() && Character.isDigit(input.charAt(index))) {
      int digit = input.charAt(index) - '0';

      if (result > (Integer.MAX_VALUE - digit) / 10) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }

      result = result * 10 + digit;
      index++;
    }

    return result * sign;
  }

  private static void print(Object o) {
    System.out.println(o);
  }
}
