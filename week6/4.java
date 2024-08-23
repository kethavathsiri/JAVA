/*4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee
with information number of hours & wages per hour, number of weeks & wages per
week respectively & method calculateWages() to calculate their monthly salary. Also
override getDesig () method depending on the type of contract employee.*/
import java.util.*;
class ContractEmployee{
 void Name(String name){
 System.out.println("name :"+name);
 }
 void Id(String id){
 System.out.println("Id :"+id);
 }
 public String getDesig() {
        return "Contract Employee";
    }
 }
 class HourlyEmployee extends ContractEmployee{
 double calculateWages(double NoOfHour,double WagesPerHour){
        return NoOfHour*WagesPerHour;
        }
     public String getDesig() {
        return "Contract Employee";//overriding getDesig()
        }
        }
class WeeklyEmployee extends ContractEmployee{
 double calculateWages(double NoOfWeek,double WagesPerWeek){
 return NoOfWeek*WagesPerWeek;
 }
 public String getDesig() {
        return "Contract Employee";//overriding getDesig()
 }
 }
 class Employee {
    public static void main(String... siri) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of Hourly employee:");
        System.out.print("Enter the name of the employee:");
        String a = sc.nextLine();

        System.out.print("Enter the id:");
        String b = sc.nextLine();
        System.out.print("Enter the number of hours:");
        int c = sc.nextInt();
        System.out.print("Enter the hours & wages per hour:");
        double d = sc.nextDouble();
        System.out.println();
     HourlyEmployee h=new HourlyEmployee();
     h.Name(a);
     h.Id(b);
     h.getDesig();
     System.out.println("SALARY :"+h.calculateWages(c,d));
     sc.nextLine(); 

        System.out.println("Enter the details of Weekly employee:");
        System.out.print("Enter the name of the employee:");
        String e = sc.nextLine();
        System.out.print("Enter the id:");
        String f = sc.nextLine();
        System.out.print("Enter the number of weeks:");
        int g = sc.nextInt();
        System.out.print("Enter the wages per week:");
        double i = sc.nextDouble();
        System.out.println();
        WeeklyEmployee w=new WeeklyEmployee();
        w.Name(e);
        w.Id(f);
        w.getDesig();
        System.out.println("SALARY :"+w.calculateWages(g,i));
        }
        }
        

    
