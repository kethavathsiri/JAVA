/*3. Write an application to create a super class Employee with information first name
& last name and methods getFirstName(), getLastName() derive the sub-classes
ContractEmployee and RegularEmployee with the information about department,
designation & method displayFullName() , getDepartment(), getDesig() to print the
salary and to set department name & designation of the corresponding sub-class
objects respectively.*/
import java.util.*;
class Employee{
 String getFirstName(String FirstName){
 return FirstName;
 }
 String getLastName(String LastName){
 return LastName;
 }
 /*void displayFullName(){
 System.out.println("fullname :"+FirstName+" "+LastName);
 }*/
 }
 class ContractEmployee extends Employee{
 //super(FirstName,LastName);
 /*void displayFullName(){
 System.out.println("fullname :"+FirstName+" "+LastName);
 }*/
 void department(String dept){
 System.out.println("department :"+dept);
 }
 void designation(String design){
 System.out.println("department :"+design);
 }
 void Salary(double salary){
 System.out.println("Salary :"+salary);
 }
 }
 class RegularEmployee extends Employee{
 //super(FirstName,LastName);
 /*void displayFullName(){
 System.out.println("fullname :"+FirstName+" "+LastName);
 }*/
 void department(String dept){
 System.out.println("department :"+dept);
 }
 void designation(String design){
 System.out.println("department :"+design);
 }
 void Salary(double salary){
 System.out.println("Salary :"+salary);
 }
 }
 class Hierarchical{
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter the details of contractor:");
        System.out.print("enter the first name:");
        String a=sc.nextLine();
        System.out.print("enter the last name:");
        String b=sc.nextLine();
        System.out.print("enter the department:");
        String c=sc.nextLine();
        System.out.print("enter the designation:");
        String d=sc.nextLine();
        System.out.print("enter contractor salary:");
        double e=sc.nextDouble();
        sc.nextLine();
        System.out.println();
        ContractEmployee s=new ContractEmployee();
        System.out.println("FullName :"+s.getFirstName(a)+" "+s.getLastName(b));
        s.department(c);
        s.designation(d);
        s.Salary(e);
        System.out.println();
         System.out.println("enter the details of contractor:");
        System.out.print("enter the first name:");
        String f=sc.nextLine();
        System.out.print("enter the last name:");
        String g=sc.nextLine();
        System.out.print("enter the department:");
        String h=sc.nextLine();
        System.out.print("enter the designation:");
        String i=sc.nextLine();
        System.out.print("enter contractor salary:");
        double j=sc.nextDouble();
        sc.nextLine();
        System.out.println();
        RegularEmployee r=new RegularEmployee();
      System.out.println("FullName :"+r.getFirstName(f)+" "+r.getLastName(g));
        r.department(h);
        r.designation(i);
        r.Salary(j);
        }
        }
        
        
 
 
 
  
