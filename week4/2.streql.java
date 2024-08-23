/*2. Write an application that uses String method equals and equalsIgnoreCase to tests
any two string objects for equality.*/

/*import java.util.*;
class A{
 public static void main(String...args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the first string:");
 String str1=sc.nextLine();
 System.out.println("enter the second string:");
 String str2=sc.nextLine();
 if(str1.equals(str2))
 System.out.println("string are equal");
 
 else
 System.out.println("both strings are equal");
 if(str1.equalsIgnoreCase(str2))
 System.out.println("string are equal");
 
 else
 System.out.println("strings  are not equal");
 }
 }*/
 import java.util.Scanner;

public class StringEqualityApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Get the second string from the user
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Test equality using equals method
        if (str1.equals(str2)) {
            System.out.println("The strings are equal (case-sensitive).");
        } else {
            System.out.println("The strings are not equal (case-sensitive).");
        }

        // Test equality ignoring case using equalsIgnoreCase method
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The strings are equal (case-insensitive).");
        } else {
            System.out.println("The strings are not equal (case-insensitive).");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

 
