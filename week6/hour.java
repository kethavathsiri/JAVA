/*4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee
with information number of hours & wages per hour, number of weeks & wages per
week respectively & method calculateWages() to calculate their monthly salary. Also
override getDesig () method depending on the type of contract employee.*/
import java.util.*;

class ContractEmployee {
    String name;
    int id;

    ContractEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getDesig() {
        return "Contract Employee";
    }

    public double calculateWage() {
        return 0.0;
    }
}

class HourlyEmployee extends ContractEmployee {
    int NoOfHours;
    double WagesPerHour;

    HourlyEmployee(String name, int id, int NoOfHours, double WagesPerHour) {
        super(name, id);
        this.NoOfHours = NoOfHours;
        this.WagesPerHour = WagesPerHour;
    }

    void display() {
        System.out.println("Name:" + name + "\n" + "id:" + id);
    }

    //Override
    public String getDesig() {
        return "Hourly Employee";
    }

    //Override
    public double calculateWages() {
        return NoOfHours * WagesPerHour * 4;
    }
}

class WeeklyEmployee extends ContractEmployee {
    int NoOfweek;
    double WagesPerWeek;

    WeeklyEmployee(String name, int id, int NoOfweek, double WagesPerWeek) {
        super(name, id);
        this.NoOfweek = NoOfweek;
        this.WagesPerWeek = WagesPerWeek;
    }

    void display() {
        System.out.println("Name:"+name);
        System.out.println("id:" + id);
    }

    //Override
    public String getDesig() {
        return "Weekly Employee";
    }

    //Override
    public double calculateWages() {
        return NoOfweek * WagesPerWeek*30;
    }
}

class Employee {
    public static void main(String... siri) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of Hourly employee:");
        System.out.print("Enter the name of the employee:");
        String a = sc.nextLine();

        System.out.print("Enter the id:");
        int b = sc.nextInt();
        System.out.print("Enter the number of hours:");
        int c = sc.nextInt();
        System.out.print("Enter the hours & wages per hour:");
        double d = sc.nextDouble();
        System.out.println();

        HourlyEmployee h = new HourlyEmployee(a, b, c, d);
        h.display();

        System.out.println("Designation:" + h.getDesig());
        System.out.println("Monthly salary:" + h.calculateWages());
        System.out.println();

        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the details of Weekly employee:");
        System.out.print("Enter the name of the employee:");
        String e = sc.nextLine();

        System.out.print("Enter the id:");
        int f = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter the number of weeks:");
        int g = sc.nextInt();
        System.out.print("Enter the wages per week:");
        double i = sc.nextDouble();
        System.out.println();

        WeeklyEmployee w = new WeeklyEmployee(e, f, g, i);
        w.display();

        System.out.println("Designation:" + w.getDesig());
        System.out.println("Monthly salary:" + w.calculateWages());
        System.out.println();
    }
}

