/*2. Write an application that prompts the user for the radius of a circle and uses a
method called circleArea to calculate the area of the circle and uses a method
circlePerimeter to calculate the perimeter of the circle.*/

import java.util.*;
class circle{
double radius;
        void insertVal(double  r){
            radius=r;
        }
        void circleArea( float r){
       float area=3.14f*r*r;
        System.out.println("area of circle:"+area);
        }
        void circlePerimeter(float r){
        float perimeter=2*3.14f*r;
        System.out.println("perimeter:"+perimeter);
        }
        public static void main(String...siri){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of a circle:");
        float a=sc.nextFloat();
        circle c=new circle();
        c.insertVal(a);
        c.circleArea(a);
        c.circlePerimeter(a);
        }
        }
       
      
