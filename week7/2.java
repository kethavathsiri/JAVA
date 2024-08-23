/*2. Create an abstract class Employee with methods getAmount() which displays the
amount paid to employee. Reuse this class to calculate the amount to be paid to
WeeklyEmployeed and HourlyEmployee according to no. of hours and total hours
for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.*/
import java.util.Scanner;
abstract class  Employee{
abstract double getAmount();
}
class HourlyEmployee extends Employee{
public   double NoOfHours;
public double WagesPerHour;
HourlyEmployee(double NoOfHours,double WagesPerHour){
this.NoOfHours=NoOfHours;
this.WagesPerHour=WagesPerHour;
}
 double getAmount() {
return NoOfHours * WagesPerHour * 4;
}
}
class WeeklyEmployee extends Employee{
public double NoOfWeek;
public double WagesPerHour;
WeeklyEmployee(double NoOfWeek,double WagesPerHour){
this.NoOfWeek=NoOfWeek;
this.WagesPerHour=WagesPerHour;
}
 double getAmount() {
return NoOfWeek* WagesPerHour * 30;
}
}
class Two{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no. of hours: ");
double s1= sc.nextDouble();
System.out.print("Enter wage per hour: ");
double s2= sc.nextDouble();
Employee e=new HourlyEmployee(s1,s2);
System.out.println("Amount for Hourly Employee:  "+e.getAmount());
System.out.print("Enter the no. of weeks: ");
double s3= sc.nextDouble();
System.out.print("Enter wage per week: ");
double s4= sc.nextDouble();
Employee ee=new WeeklyEmployee(s3,s4);
System.out.println("Amount for Weekly Employee:  "+ee.getAmount());
}
}








