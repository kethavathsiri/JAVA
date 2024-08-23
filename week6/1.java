//1. Write a Java program to find Area and Circle of different shapes using polymorphism
//concept
import java.util.*;
class circle{
     //float radius;
     static double getArea(double r){
     //return 3.14*r*r;
     return Math.PI*r*r;
     }
     static int Square(int s){
     //return 2.math.pi*r;
     return s*s;
     }
     static int getRec(int l,int b){
     return l*b;
     }
     }
     class Test{
     public static void main(String...siri){
 Scanner sc=new Scanner(System.in);
 System.out.print("enter radius:");
 double a=sc.nextDouble();
 System.out.print("enter the side:");
 int b=sc.nextInt();
 System.out.print("enter the length and breadth:");
 int c=sc.nextInt();
 int d=sc.nextInt();
 //circle m=new circle();
 System.out.println("circle area:"+circle.getArea(a));
 System.out.println("square area:"+circle.Square(b));
 System.out.println("rectangle area:"+circle.getRec(c,d));
 }
 }
 
/* class Shapes{
  int area(int a){
  return a*a;
  }
  double area(double l,double b){
  return l*b;
  }
  float area(float a){
  return 6*a*a;
  }
  double area(double r){
  return Math.PI*r*r;
  }
  }
  class B{
  public static void main(String...args){
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the side of square : ");
  int side=sc.nextInt();
  System.out.print("enter the length and breadth  : ");
  double l=sc.nextDouble();
  double b=sc.nextDouble();
  System.out.print("enter the cube : ");
  float c=sc.nextFloat();
  System.out.print("enter the sphere radius : ");
  double s=sc.nextDouble();
  Shapes s1=new Shapes();
  System.out.println(s1.area(side));
  System.out.println(s1.area(l,b));
  System.out.println(s1.area(c));
  System.out.println(s1.area(s));
  }
  }*/
      
  
  

