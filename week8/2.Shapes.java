package lab;
import org.shapes.square;
import org.shapes.Triangle;
import org.shapes.circle;
import java.util.*;

class Shapes{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the side  of square;");
  double a=sc.nextDouble();
  square s=new square(a);
  
  System.out.print("Enter the base length of the triangle: ");
  double b=sc.nextDouble();
  double h=sc.nextDouble();
  
  Triangle t=new Triangle(b,h);
  
  System.out.print("enter the radius of circle");
  double r=sc.nextDouble();
  circle c=new circle(r);
  
  System.out.println("\nResults:");
        System.out.println("Square Area: " + s.getArea());
        System.out.println("Square Perimeter: " + s.getPerimeter());

        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Triangle Perimeter: " + t.getPerimeter());

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());
        }
        }

  
  
  
  
