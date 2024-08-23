//1.method 2 to compare string
import java.util.*;
class STRINGS{
 public static void main(String...args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the first stirng :");
 String str1=sc.nextLine();
 System.out.println("enter the second string:");
 String str2=sc.nextLine();
 if(str1.compareTo(str2)>0)
 System.out.println("1 ");//greater
 else if(str1.compareTo(str2)<0)
 System.out.println("-1 ");//smaller
 else
 System.out.println("0");
 }
 }
 
