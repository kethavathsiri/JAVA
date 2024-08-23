/*5. Write an application to create a super class Vehicle with information vehicle
number,insurance number,color and methods getConsumption() displayConsumption().
Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
average() to print the maintenance And average of vehicle.*/
import java.util.*;
class Vehicle{
  String Vehicle_No;
  String Insurance_No;
  String color;
  double consumption;
  void getConsumption(String Vehicle_No,String Insurance_No,String color,double consumption){
  this.Vehicle_No=Vehicle_No;
  this.Insurance_No=Insurance_No;
  this.color=color;
  this.consumption=consumption;
  }
  void displayConsumption(){
  System.out.println("Vehicle Number: " + Vehicle_No);
        System.out.println("Insurance Number: " + Insurance_No);
        System.out.println("Color: " + color);
        System.out.println("Fuel Consumption: " + consumption+ " liters");
        }
        }
 class TwoWheeler extends Vehicle{
   void average(double average) {
    System.out.println("Two-wheeler average: "+average+"km/h");
    }
    void maintenance() {
    System.out.println("Two-wheeler maintenance: Regular checkup and oil change");
    }
    }
    
    class FourWheeler extends Vehicle{
    void average(double average) {
    System.out.println("Two-wheeler average: "+average+"km/h");
    }
    void maintenance() {
    System.out.println("Four-wheeler maintenance: Regular servicing and tire rotation");
    }
    }
    class week{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for TwoWheeler:");
        System.out.print("Vehicle Number: ");
        String a = sc.next();
        System.out.print("Insurance Number: ");
        String b = sc.next();
        System.out.print("Color: ");
        String c = sc.next();
        System.out.print("Enter the consumption: ");
        double d = sc.nextDouble();
        System.out.print("enter the average :");
        double e=sc.nextDouble();
        System.out.println();
        TwoWheeler t=new TwoWheeler();
        t.getConsumption(a,b,c,d);
        t.displayConsumption();
        t.maintenance();
        t.average(e);
        System.out.println();
        System.out.println("Enter details for TwoWheeler:");
        System.out.print("Vehicle Number: ");
        String f = sc.next();
        System.out.print("Insurance Number: ");
        String g= sc.next();
        System.out.print("Color: ");
        String h = sc.next();
        System.out.print("Enter the consumption: ");
        double i = sc.nextDouble();
        System.out.print("enter the average :");
        double j=sc.nextDouble();
        System.out.println();
        FourWheeler s=new FourWheeler();
        s.getConsumption(f,g,h,i);
        s.displayConsumption();
        t.maintenance();
        t.average(j);
        }
        }
        
    
  
  
 
