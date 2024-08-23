//7. Write an application that uses String method charAt to reverse the string.
import java.util.*;
class ReverseString{
public static void main(String...siri){
Scanner sc=new Scanner(System.in);
 System.out.print("enter the first string:");
 String str=sc.nextLine();
 System.out.println("Original string is:"+str);
 System.out.print ("Reverse of a string :");
 for(int i=str.length()-1;i>=0;i--){
  System.out.print(str.charAt(i));
  }
  System.out.println();
 } 
}  
 
 
