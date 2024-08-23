import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("Enter a string:");
    String str = scanner.nextLine();
   
    System.out.println("Enter start index for substring:");
    int startIndex = scanner.nextInt();
   
    System.out.println("Enter end index for substring:");
    int endIndex = scanner.nextInt();
   
    // Using substring() to get substring
    String subStr = str.substring(startIndex, endIndex);
    System.out.println("Substring: " + subStr);
   
    // Using startsWith() to check if str starts with subStr
    boolean starts = str.startsWith(subStr);
    System.out.println("Starts with substring: " + starts);
   
    // Using endsWith() to check if str ends with subStr
    boolean ends = str.endsWith(subStr);
    System.out.println("Ends with substring: " + ends);
  }
}
