/*3. Write an application to create a super class Employee with information first name
& last name and methods getFirstName(), getLastName() derive the sub-classes
ContractEmployee and RegularEmployee with the information about department,
designation & method displayFullName() , getDepartment(), getDesig() to print the
salary and to set department name & designation of the corresponding sub-class
objects respectively.*/
import java.util.*;
class Employee{
        String f_name;
        String l_name;
        public Employee(String f_name,String l_name){//public in the sense we can access anywhere in the program
        this.f_name=f_name;
        this.l_name=l_name;
        }
        public String getFirstName(){
        return f_name;
        }
        public String getLastName(){
        return l_name;
        }
        }
class ContractEmployee extends Employee{
         String dept;
         String designation;
          double salary;
         public ContractEmployee (String f_name,String l_name,String dept,String designation,double salary){
         super(f_name,l_name);//to access the parent class
         this.dept=dept;
         this.salary=salary;
         this.designation=designation;
         }
         void displayFullName(){
         System.out.println(getFirstName()+" "+getLastName());
         }
         public String getDepartment(){
         return dept;
         }
         public String getDesig(){
         return designation;
         }
         public double getSalary(){
         return salary;
         }
         }
class RegularEmployee extends Employee
         {
         String dept;
         String designation;
         double salary;
         public RegularEmployee (String f_name,String l_name,String dept,String designation,double salary){
         super(f_name,l_name);
         this.dept=dept;
         this.salary=salary;
         this.designation=designation;
         }
         void displayFullName(){
         System.out.println(getFirstName()+" "+getLastName());
         }
         public String getDepartment(){
         return dept;
         }
         public String getDesig(){
         return designation;
         }
         public double getSalary(){
         return salary;
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
        double m=sc.nextDouble();
        sc.nextLine();
        System.out.println();
        ContractEmployee s=new ContractEmployee(a,b,c,d,m);
        System.out.print("full name:");
        s.displayFullName();
        System.out.println("Department:"+s.getDepartment());
        System.out.println("Designation:"+s.getDesig());
        System.out.println("Salary:"+s.getSalary());
        System.out.println();
        
        System.out.println("enter the details of regular Employee:");
        System.out.print("enter the first name:");
        String e=sc.nextLine();
        //sc.nextLine();
        System.out.print("enter the last name:");
        String f=sc.nextLine();
        System.out.print("enter the department:");
        String g=sc.nextLine();
        System.out.print("enter the designation:");
        String h=sc.nextLine();
        System.out.print("enter employee salary:");
        double n=sc.nextDouble();
        System.out.println();
        RegularEmployee r=new RegularEmployee(e,f,g,h,n);
        System.out.print("full name:");
        r.displayFullName();
        System.out.println("Department:"+r.getDepartment());
        System.out.println("Designation:"+r.getDesig());
        System.out.println("salary:"+r.getSalary());
        System.out.println();
        }
}
        
        
        
        
        
         
         
         
         
         
         
          
        
        
        
        
        
