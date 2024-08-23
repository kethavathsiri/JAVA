/*1. Program for demonstrating the use of throw, throws & finally - Create a class with a
main( ) that throws an object of class Exception inside a try block. Give the constructor
for Exception a String argument. Catch the exception inside a catch clause and print the
String argument. Add a finally clause and print a message to prove you were there.*/
import java.util.*;
class MyException extends Exception
{
MyException(String message)
{
super(message);
}
}
public class exception1
{
public static void main(String[] args)
{
String msg,msge;
Scanner sc=new Scanner(System.in);
System.out.print("enter the throw message:");
msg=sc.nextLine();
System.out.print("enter the finally message:");
msge=sc.nextLine();
try{
throw new MyException(msg);
}
catch(MyException e)
{
System.out.println("caught exception: "+e.getMessage());//inbuilt function getMessage()
}
finally{
System.out.println("finally block executed: "+msge);
}
}
}
