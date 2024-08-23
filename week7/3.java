/*3. Create an Interface payable with method getAmount ().Calculate the amount to be
paid to Invoice and Employee by implementing Interface.*/

/*import java.util.*;

interface Payable {
    double getAmount();
}

class Employee implements Payable {
     double amount;

    // Constructor
    public Employee(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}
class A {
    public static void main(String... siri) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the salary: ");
        double charge = sc.nextDouble();
        System.out.print("enter the bonus: ");
        double invoice = sc.nextDouble();
        System.out.println();
        Employee e = new Employee(charge + invoice);

        System.out.println("total amount: " + e.getAmount());
    }
}*/
//WITHOUT CONSTURCTOR
import java.util.*;

interface Payable {
    double getAmount(double amount);
}

class Employee implements Payable {
     double amount;
    public double getAmount(double amount) {
        return amount;
    }
}
class A {
    public static void main(String... siri) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the salary: ");
        double charge = sc.nextDouble();
        System.out.print("enter the bonus: ");
        double invoice = sc.nextDouble();
        System.out.println();
        double total=charge+invoice;
         Employee e = new Employee();

        System.out.print("total amount: " + e.getAmount(total));
    }
}

    
 

    
 
