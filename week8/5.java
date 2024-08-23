package hi;
import Shape.Circle;
import java.util.*;
/*class Main{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the radius ");
   double a=sc.nextDouble();
   Circle c=new Circle(a);
   
   System.out.println("Original Circle:");
   display(c);
   
   System.out.print("\nnEnter the percentage to resize the circle: ");
   double r=sc.nextDouble();
   
   System.out.println("\nResized Circle:");
   display(c);
   }
   static void display(Circle c){
    System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
    }
    }*/
    //import shapes.Circle;

//import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("Original Circle:");
        displayCircleInfo(circle);

        System.out.print("\nEnter the percentage to resize the circle: ");
        double resizePercentage = scanner.nextDouble();
        circle.resize(resizePercentage);

        System.out.println("\nResized Circle:");
        displayCircleInfo(circle);   
    }
    static void displayCircleInfo(Circle circle) {
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}

   
   
   
   
   
