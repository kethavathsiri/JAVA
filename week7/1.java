/*1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
shapes with methods getArea() and getVolume(). Reuse this class to calculate the area
and volume of square ,circle ,cube and sphere.*/
/*import java.util.*;
 
 abstract class shape{
 abstract double getArea();
 abstract double getVolume();
 }
 class circle extends shape{
 public double rad;
 public circle(double rad){
 this.rad=rad;
 }
 double getArea(){
 return Math.PI*rad*rad;
 }
 double getVolume()
  {
  return 0;
  }
 }
 class square extends shape{
 public double side;
 public square(double side){
 this.side=side;
 }
 double getArea(){
 return side*side;
 }
 double getVolume()
{
return 0;
}
 }
 class cube extends shape{
 public double s;
 public cube(double s){
 this.s=s;
 }
 double getArea(){
 return 6*s;
 }
 double getVolume(){
 return s*s*s;
 }
 }
 class sphere extends shape{
 public double r;
 public sphere(double r){
 this.r=r;
 }
 double getArea(){
 return 4*Math.PI*r*r;
 }
 double getVolume(){
 return (4/3)*Math.PI*r*r*r;
 }
 }
 class Hello{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 
 System.out.print("enter the radius of circle:");
 double a=sc.nextDouble();
 shape s1=new circle(a);
 
 System.out.println("area of circle:"+s1.getArea());
 //System.out.println(s1.getArea());
 System.out.println(" volume of circle:"+s1.getVolume());
 //System.out.println(s1.getVolume());
 
 System.out.print("enter the side of square:");
 double b=sc.nextDouble();
 shape s2=new square(b);
 
 System.out.println("area of square:"+s2.getArea());
 //System.out.println(s2.getArea());
 System.out.println(" volume of square:"+s2.getVolume());
 //System.out.println(s2.getVolume());
 
 System.out.print("enter the radius of cube:");
 double c=sc.nextDouble();
 shape s3=new cube(c);
 
 System.out.print("area of cube:"+s3.getArea());
 //System.out.print(s3.getArea());
 System.out.println(" volume of cube:"+s3.getVolume());
 //System.out.print(s3.getVolume());
 System.out.print("enter the radius of sphere :");
 double d=sc.nextDouble();
 shape s4=new sphere(d);
 System.out.println("area of sphere:"+s4.getArea());
 //System.out.print(s4.getArea());
 System.out.println("volume of sphere:"+s4.getVolume());
 //System.out.print(s4.getVolume());
 }
 }*/
 
import java.util.*;
abstract class Shape
{
abstract void getArea(int r);
abstract void getVolume(int a);
}
class Calculations extends Shape
{
public void getArea(int r)
{
System.out.println("Area of square is: "+(r*r));
System.out.println("Area of the circle is:" +(3.14*r*r));
System.out.println("Surface area of the cube is:"+(6*r*r));
System.out.println("Surface area of the sphere is:"+(4*3.14*r*r));}
public void getVolume(int r)
{
System.out.println("Volume of the cube is:" +(r*r*r));
System.out.println("Volume of the sphere is:"+(1.33*3.14*r*r*r));
}
}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius for area and volume:");
int R=sc.nextInt();
///*System.out.println("Enter the volume:");
//int A=sc.nextInt();
Shape sh=new Calculations();
sh.getArea(R);
sh.getVolume(R);
}
}


  
 
 
 
 
 
 
 
 

    
    
    
    
    
    

 
 
 
