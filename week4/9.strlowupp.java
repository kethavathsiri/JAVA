/*9. Write an application that changes any given string with uppercase letters, displays
it, changes it back to lowercase letters and displays it.*/

import java.util.*;
class CaseString{
public static void main(String...siri){
Scanner sc=new Scanner(System.in);
 System.out.print("enter the first string:");
 String str=sc.nextLine();
 String lowerCase=str.toLowerCase();
 System.out.println("lower case:"+lowerCase);
 String upperCase=str.toUpperCase();
 System.out.println("Upper case:"+upperCase);
 }
 }
 
