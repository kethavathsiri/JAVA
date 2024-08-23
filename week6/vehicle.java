/*5. Write an application to create a super class Vehicle with information vehicle
number,insurance number,color and methods getConsumption() displayConsumption().
Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
average() to print the maintenance And average of vehicle.*/

import java.util.*;

class Vehicle {
    int vehicle_no;
    int insurance_no;
    String color;

    Vehicle(int vehicle_no, int insurance_no, String color) {
        this.vehicle_no = vehicle_no;
        this.insurance_no = insurance_no;
        this.color = color;
    }
    double getConsumption() {
        return 0.0;
    }
    void display() {
        System.out.println("Vehicle Number: " + vehicle_no);
        System.out.println("Insurance Number: " + insurance_no);
        System.out.println("Color: " + color);
        System.out.println("Fuel Consumption: " + getConsumption() + " liters");
    }
}
class TwoWheeler extends Vehicle {
    double consumption;

    TwoWheeler(int vehicle_no, int insurance_no, String color, double consumption) {
        super(vehicle_no, insurance_no, color);
        this.consumption = consumption;
    }

    public double getConsumption() {
        return consumption;
    }

    void average() {
        System.out.println("Two-wheeler average: "+consumption+"km/h");
    }

    void maintenance() {
        System.out.println("Two-wheeler maintenance: Regular checkup and oil change");
    }
}

class FourWheeler extends Vehicle {
    double consumption;

    FourWheeler(int vehicle_no, int insurance_no, String color, double consumption) {
        super(vehicle_no, insurance_no, color);
        this.consumption = consumption;
    }

    public double getConsumption() {
        return consumption;
    }

    void average() {
        System.out.println("Four-wheeler average: "+consumption+"km/h");
    }

    void maintenance() {
        System.out.println("Four-wheeler maintenance: Regular servicing and tire rotation");
    }
}

class VehicleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for TwoWheeler
        System.out.println("Enter details for TwoWheeler:");
        System.out.print("Vehicle Number: ");
        int a = sc.nextInt();
        System.out.print("Insurance Number: ");
        int b = sc.nextInt();
        System.out.print("Color: ");
        String c = sc.next();
        System.out.print("Enter the consumption: ");
        double d = sc.nextDouble();
        System.out.println();
        TwoWheeler t = new TwoWheeler(a, b, c, d);
        t.display();
        t.maintenance();
        t.average();
        System.out.println();

        // Input for FourWheeler
        System.out.println("Enter details for FourWheeler:");
        System.out.print("Vehicle Number: ");
        int e = sc.nextInt();
        System.out.print("Insurance Number: ");
        int n = sc.nextInt();
        System.out.print("Color: ");
        String g = sc.next();
        System.out.print("Enter the consumption: ");
        double h = sc.nextDouble();
        System.out.println();
        FourWheeler f = new FourWheeler(e, n, g, h);
        f.display();
        f.maintenance();
        f.average();
    }
}

        
        
        
        
        
        
        
 
 
 
