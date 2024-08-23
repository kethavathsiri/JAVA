/*6. Create an Interface StudentFee with method getAmount(),getFirstName(),getLastName(),
getAddress(), getContact(). Calculate the amount paid by the Hostler and NonHostler
student by implementing interface Student Fee*/
import java.util.*;
interface StudentFee{
double getAmount(double amount);
String getFirstName(String FName);
String getLastName(String LName);
String getAddress(String address);
long  getContact(long  contact);
}
class Hostler implements StudentFee{
public double getAmount(double amount){
 return amount;
 }
public String getFirstName(String FName){
 return FName;
 }
public String getLastName(String LName){
 return LName;
 }
public String getAddress(String address){
 return address;
 }
 public long getContact(long  contact){
 return contact;
 }
 }
 class NonHostler implements StudentFee{
 public double getAmount(double amount){
 return amount;
 }
 public String getFirstName(String FName){
 return FName;
 }
public String getLastName(String LName){
 return LName;
 }
public String getAddress(String address){
 return address;
 }
 public long  getContact(long  contact){
 return contact;
 }
 }
class studentFee{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.print("enter the hostler first name:");
 String a=sc.nextLine();
 System.out.print("enter the hostler last name:");
 String b=sc.nextLine();
 System.out.print("enter the address:");
 String c=sc.nextLine();
 System.out.print("enter the contact:");
 long d=sc.nextLong();
 System.out.print("enter the fee:");
 double e=sc.nextDouble();
 System.out.println();
 Hostler h=new Hostler();
 System.out.println("Name:"+h.getFirstName(a));
 System.out.println("Last name"+h.getLastName(b));
 System.out.println("Address:"+h.getAddress(c));
 System.out.println("contact:"+h.getContact(d));
 System.out.println("Fee:"+h.getAmount(e));
 System.out.println();
 sc.nextLine();
 System.out.print("enter the nonhostler first name:");
 String f=sc.nextLine();
 //sc.nextLine();
 System.out.print("enter the nonhostler last name:");
 String g=sc.nextLine();
 System.out.print("enter the address:");
 String i=sc.nextLine();
 System.out.print("enter the contact:");
 long j=sc.nextLong();
 System.out.print("enter the fee:");
 double k=sc.nextDouble();
 System.out.println();
 NonHostler h1=new NonHostler();
 System.out.println("Name:"+h1.getFirstName(f));
 System.out.println("last name:"+h1.getLastName(g));
 System.out.println("Address:"+h1.getAddress(i));
 System.out.println("contact:"+h1.getContact(j));
 System.out.println("Fee:"+h1.getAmount(k));
 }
 }
 
 

