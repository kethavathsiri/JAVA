/*4. Write an application that uses String method concat to concatenate two defined
strings.*/
/*import java.util.*;
class add{
public static void main(String...siri){
Scanner sc=new Scanner(System.in);
 System.out.println("enter the first string:");
 String str1=sc.nextLine();
 System.out.println("enter the second string:");
 String str2=sc.nextLine();
 String result=str1.concat(str2);
 System.out.println(result);
 }
 }*/
 import java.util.Scanner;

public class UserInputConcatenationApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Get the second string from the user
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Concatenate strings using concat method
        String result = str1.concat(str2);

        // Display the result
        System.out.println("Concatenated String: " + result);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

