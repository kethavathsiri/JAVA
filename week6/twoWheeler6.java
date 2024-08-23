/*6. Extend the above TwoWheeler class with methods getType() and getName()
which gives the information about the type and the name of the company.Create
sub-classes Geared and NonGeared with method average() to print the average of
a geared and non-geared two wheeler.*/
import java.util.*;

class Vehicle {
    String vehicle_no;
    int insurance_no;
    String color;
    Vehicle(String vehicle_no, int insurance_no, String color) {
        this.vehicle_no = vehicle_no;
        this.insurance_no = insurance_no;
        this.color = color;
    }
    void display() {
        System.out.println("Vehicle Number: " + vehicle_no);
        System.out.println("Insurance Number: " + insurance_no);
        System.out.println("Color: " + color);
        System.out.println("Fuel Consumption: " + getConsumption() + " liters");
    }
    double getConsumption() {
        return 0.0;
    }
}
class TwoWheeler extends Vehicle {
    double consumption;
    String type;
    String name;

    TwoWheeler(String vehicle_no, int insurance_no, String color, double consumption, String type, String name) {
        super(vehicle_no, insurance_no, color);
        this.consumption = consumption;
        this.type = type;
        this.name = name;
    }

    public double getConsumption() {
        return consumption;
    }

    void average() {
        System.out.println("Average of a two-wheeler: " + consumption + " km/l");
    }

    void maintenance() {
        System.out.println("Two-wheeler maintenance: Regular checkup and oil change");
    }

    void getType() {
        System.out.println("Type of TwoWheeler: " + type);
    }

    void getName() {
        System.out.println("Name of TwoWheeler: " + name);
    }
}

class Geared extends TwoWheeler {
    Geared(String vehicle_no, int insurance_no, String color, double consumption, String type, String name) {
        super(vehicle_no, insurance_no, color, consumption, type, name);
    }

    void average() {
        System.out.println("Average of a geared two-wheeler: " + getConsumption() + " km/l");
    }
}

class NonGeared extends TwoWheeler {
    NonGeared(String vehicle_no, int insurance_no, String color, double consumption, String type, String name) {
        super(vehicle_no, insurance_no, color, consumption, type, name);
    }

    void average() {
        System.out.println("Average of a non-geared two-wheeler: " + getConsumption() + " km/l");
    }
}

class VehicleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for TwoWheeler
        System.out.println("Enter details for TwoWheeler:");
        System.out.print("Vehicle Number: ");
        String a = sc.nextLine();
        System.out.print("Insurance Number: ");
        int b = sc.nextInt();
        System.out.print("Color: ");
        String c = sc.next();
        System.out.print("Enter the consumption: ");
        double d = sc.nextDouble();
        System.out.print("Enter the type: ");
        String type = sc.next();
        System.out.print("Enter the name: ");
        String name = sc.next();
        System.out.println();

        TwoWheeler t = new TwoWheeler(a, b, c, d, type, name);
        t.display();
        t.getType();
        t.getName();
        t.maintenance();
        t.average();
        System.out.println();
        // Input for Geared
        System.out.println("Enter details for Geared TwoWheeler:");
        System.out.print("Vehicle Number: ");
        String e = sc.nextLine();
        sc.nextLine();
        System.out.print("Insurance Number: ");
        int n = sc.nextInt();
        System.out.print("Color: ");
        String g = sc.next();
        System.out.print("Enter the consumption: ");
        double h = sc.nextDouble();
        System.out.print("Enter the type: ");
        String gearedType = sc.next();
        System.out.print("Enter the name: ");
        String gearedName = sc.next();
        System.out.println();
        Geared geared = new Geared(e, n, g, h, gearedType, gearedName);
        geared.average();
        System.out.println();
        // Input for NonGeared
        System.out.println("Enter details for NonGeared TwoWheeler:");
        System.out.print("Vehicle Number: ");
        String f = sc.nextLine();
        sc.nextLine();
        System.out.print("Insurance Number: ");
        int m = sc.nextInt();
        System.out.print("Color: ");
        String k = sc.next();
        System.out.print("Enter the consumption: ");
        double l = sc.nextDouble();
        System.out.print("Enter the type: ");
        String nonGearedType = sc.next();
        System.out.print("Enter the name: ");
        String nonGearedName = sc.next();

        NonGeared nonGeared = new NonGeared(f, m, k, l, nonGearedType, nonGearedName);
        nonGeared.average();
        

    }
}

