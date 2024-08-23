package siri;
import java.util.Scanner;
import calculator.*;
/*import calculator.Subtraction;
import calculator.Multiplication;
import calculator.Division;*/

 class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        while(true){
        System.out.println("Calculator Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
       System.out.println();
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
       if(choice==-1){
       System.out.println("program exited");
       break;
       }
        switch (choice) {
            case 1:
                System.out.println("Result: " + Addition.add(num1,num2));
                 System.out.println();
                break;
            case 2:
                System.out.println("Result: " + Subtraction.subtract(num1,num2));
                 System.out.println();
                break;
            case 3:
                System.out.println("Result: " + Multiplication.multiply(num1,num2));
                 System.out.println();
                break;
            case 4:
                System.out.println("Result: "+Division.divide(num1,num2));
                 System.out.println();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
        }
        }
        }
