/*4. Create an Interface Vehicle with method getColor(),getNumber(), getConsumption()
calculate the fuel consumed, name and color for TwoWheeler and Four Wheeler By
implementing interface Vehicle.*/
//WITHOUT CONSTUCTOR
import java.util.Scanner;
interface Vehicle {
    String getColor(String color);
    double getNumber(double number);
    double getConsumption(double fuelConsumption);
}
class TwoWheeler implements Vehicle {
    public String getColor(String color) {
    return color;
    }
    public double getConsumption(double fuelConsumption) {
    return fuelConsumption;
    }
    public double getNumber(double number) {
    return number;
    }
}

class FourWheeler implements Vehicle {
    public String getColor(String color) {
    return color;
    }
    public double getConsumption(double fuelConsumption) {
    return fuelConsumption;
    }
    public double getNumber(double number) {
    return number;
    }
}
class A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color: ");
        String a = sc.nextLine();
        System.out.print("Enter the number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the fuel consumption: ");
        double c = sc.nextDouble();
        System.out.println();
        TwoWheeler t = new TwoWheeler();
        System.out.println("Color: " + t.getColor(a));
        System.out.println("Number: " + t.getNumber(b));
        System.out.println("Fuel Consumption: " + t.getConsumption(c));
        System.out.println();
        
        System.out.print("Enter the color: ");
        String d = sc.next();
        System.out.print("Enter the number: ");
        double e = sc.nextDouble();
        System.out.print("Enter the fuel consumption: ");
        double g = sc.nextDouble();
        System.out.println();
        FourWheeler f = new FourWheeler();
        System.out.println("Color: " + f.getColor(d));
        System.out.println("Number: " + f.getNumber(e));
        System.out.println("Fuel Consumption: " + f.getConsumption(g));   
    }
}


 
