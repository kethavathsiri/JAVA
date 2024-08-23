//1.method 1
/*Write an application that uses String method compareTo to compare two strings
defined by the user.*/
import java.util.*;

class STRINGS{
 public static void main(String...args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the first stirng :");
 String str1=sc.nextLine();
 System.out.println("enter the second string:");
 String str2=sc.nextLine();
 int result=str1.compareTo(str2);
 if(result==0)
 System.out.println("BOTH THE STRINGS ARE EUQAL");
 else if(result<0)
 System.out.println("the first string is smaller");
 else
 System.out.println("the first string is greater");
 }
}
/*import java.util.Scanner;

public class StringCompareApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Get the second string from the user
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare the strings using compareTo method
        int result = str1.compareTo(str2);

        // Display the result based on the comparison
        if (result < 0) {
            System.out.println("The first string is lexicographically less than the second string.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically greater than the second string.");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}*/

