import java.util.*;
import java.io.*;
class  exception5
{
public static void main(String arg[]){
Scanner A=new Scanner(System.in);
System.out.println("enter a value");
String S= A.nextLine();
try{
int n=Integer.parseInt(S);
System.out.println("converted to:"+n);
}
catch(NumberFormatException e){
System.out.println("exception handled cant convert string to int");
}
//finally
//{
//}
}
}
