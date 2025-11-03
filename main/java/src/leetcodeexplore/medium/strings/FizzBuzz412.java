package old.string;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz412 {
  public static void main(String[] args) {
    System.out.println(fizzBuzz(15));
  }

  private static List<String> fizzBuzz(int n) {
    return IntStream.range(1, n + 1)
        .mapToObj(i -> {
          String toWrite = "";
          if (i % 3 == 0) toWrite += "Fizz";
          if (i % 5 == 0) toWrite += "Buzz";
          return toWrite.isEmpty() ? String.valueOf(i) : toWrite;
        })
        .collect(Collectors.toList());
  }
}
