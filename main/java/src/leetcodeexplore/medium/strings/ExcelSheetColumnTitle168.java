package lyft.string;

public class ExcelSheetColumnTitle168 {

  public static void main(String[] args) {
    System.out.println(convertToTitle(2002));
  }

  public static String convertToTitle(int columnNumber) {
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder sb = new StringBuilder();
    while (columnNumber > 0) {
      columnNumber--;
      char toAppend2 = (abc.charAt(columnNumber % 26));
      sb.append(toAppend2);
      columnNumber = columnNumber / 26;

    }

    return sb.reverse().toString();
  }
}
