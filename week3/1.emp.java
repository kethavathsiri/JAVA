/*1. Write a program to display details of the required employee based on his Id.
The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation,
Emp_salary, Emp_Address etc.,*/

import java.util.*;

class employee{
public static void main(String...siri){
 Scanner sc=new Scanner(System.in);
 int n,i,idToSearch,index=0;
 System.out.println("enter the size:");
 n=sc.nextInt();
 
 int empid[]=new int[n];
 String empName[]=new String[n];
 int empAge[]=new int[n];
 String empGender[]=new String[n];
 String empDes[]=new String[n];
 double empSal[]=new double[n];
 int empAddress[]=new int[n];
 
 for(i=0;i<n;i++){
 System.out.println("enter the employee"+(i+1)+":");
 System.out.print("enter the employee id:");
 empid[i]=sc.nextInt();
 sc.nextLine();
 
 System.out.print("enter the employee name:");
 empName[i]=sc.nextLine();
 
 System.out.print("enter the employee age:");
 empAge[i]=sc.nextInt();
 sc.nextLine();
 System.out.print("enter the employee gender:");
 empGender[i]=sc.nextLine();
 
 System.out.print("enter the Designation:");
 empDes[i]=sc.nextLine();
 
 System.out.print("enter the employee salary:");
 empSal[i]=sc.nextDouble();
 
 System.out.print("enter the employee address: ");
 empAddress[i]=sc.nextInt();
 System.out.println("\n");
 
 }
 //display the employee details
 System.out.println("Employee details:");
 for(i=0;i<n;i++){
 System.out.println("employee"+(i+1)+"-ID:"+empid[i]);
 System.out.println("Name:"+empName[i]);
 System.out.println("Age:"+empAge[i]);
 System.out.println("Gender:"+empGender[i]);
 System.out.println("Disgniation:"+empDes[i]);
 System.out.println("Salary:"+empSal[i]);
 System.out.println("ADDRESS:"+empAddress[i]);
 System.out.println("\n");
 }
 System.out.println("enter the id to search:");
 idToSearch=sc.nextInt();
 for(i=0;i<n;i++){
 if(empid[i]==idToSearch){
 index=1;
 break;
 }
 }
 if(index==1){
  //System.out.println("employee "+empid[i]+"\n");
 System.out.println("Name:"+empName[i]);
 System.out.println("Age:"+empAge[i]);
 System.out.println("Gender:"+empGender[i]);
 System.out.println("Disgniation:"+empDes[i]);
 System.out.println("Salary:"+empSal[i]);
 System.out.println("ADDRESS:"+empAddress[i]);
 }
 else{
 System.out.println("No employee found with ID " + idToSearch);
 }
 }
 }
 
 
 

