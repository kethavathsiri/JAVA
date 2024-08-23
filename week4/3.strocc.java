/*3. Write an application that uses String method indexOf to determine the total
number of occurrences of any given alphabet in a defined text.*/
 
import java.util.*;
class Occur{
 public static void main(String...siri){
 Scanner sc=new Scanner(System.in);
 int count=0;
 System.out.print("enter the string:");
 String s=sc.nextLine();
 System.out.print("enter the character:");
 char ch=sc.next().charAt(0);
 for(int i=0;i<s.length();i++){
   if(s.charAt(s.indexOf(ch))==s.charAt(i)){
   count++;
   }
   }
   //System.out.print("character "+ch+" occurs "+count+" times\n");
System.out.println("Total occurrences of '" + ch + "': " + count);
   }
} 
/*import java.util.Scanner;

public class AlphabetOccurrenceApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the alphabet to count
        System.out.print("Enter the alphabet to count: ");
        char targetAlphabet = scanner.next().charAt(0);

        // Count occurrences using indexOf method
        int totalOccurrences = 0;
        int index = inputString.indexOf(targetAlphabet);

        while (index != -1) {
            totalOccurrences++;
            index = inputString.indexOf(targetAlphabet, index + 1);
        }

        // Display the result
        System.out.println("Total occurrences of '" + targetAlphabet + "': " + totalOccurrences);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}*/
 
   
