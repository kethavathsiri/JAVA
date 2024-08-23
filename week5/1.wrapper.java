//1. Write a Java Program to implement Wrapper classes and their methods.
/*import java.util.*;
class wrapper{
      Scanner sc=new Scanner(System.in);
      int a;
      public static void main(String...siri){
      //System.out.print("enter the number for autoboxing:");
      //int a=sc.nextInt();
            int a=20;
            Integer i=a;
            System.out.println("autoboxing:"+i);
            //System.out.print("enter the number unboxing:");
            //int j=sc.nextInt();
            Integer j=10;
            int b=j.intValue();
            System.out.println("Unboxing:"+b);
            }
            }*/
            
            import java.util.Scanner;

public class WrapperExampleWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Autoboxing - converting primitive int to Integer
        System.out.print("Enter an integer: ");
        int userInputInt = scanner.nextInt();
        Integer intObj = userInputInt; // Autoboxing

        // Unboxing - converting Integer to primitive int
        int unboxedInt = intObj; // Unboxing

        System.out.println("Autoboxing and Unboxing Example:");
        System.out.println("User Input (int): " + userInputInt);
        System.out.println("Autoboxed (Integer): " + intObj);
        System.out.println("Unboxed (int): " + unboxedInt);

        // Autoboxing - converting primitive double to Double
        System.out.print("\nEnter a double: ");
        double userInputDouble = scanner.nextDouble();
        Double doubleObj = userInputDouble; // Autoboxing

        // Unboxing - converting Double to primitive double
        double unboxedDouble = doubleObj; // Unboxing

        System.out.println("User Input (double): " + userInputDouble);
        System.out.println("Autoboxed (Double): " + doubleObj);
        System.out.println("Unboxed (double): " + unboxedDouble);

        // Autoboxing - converting primitive boolean to Boolean
        System.out.print("\nEnter a boolean (true/false): ");
        boolean userInputBoolean = scanner.nextBoolean();
        Boolean boolObj = userInputBoolean; // Autoboxing

        // Unboxing - converting Boolean to primitive boolean
        boolean unboxedBoolean = boolObj; // Unboxing

        System.out.println("User Input (boolean): " + userInputBoolean);
        System.out.println("Autoboxed (Boolean): " + boolObj);
        System.out.println("Unboxed (boolean): " + unboxedBoolean);

        scanner.close();
    }
}

            
