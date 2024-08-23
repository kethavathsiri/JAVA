import java.util.*;
import java.io.*;
class exception4
{
public static void main(String[] arg)
{
Scanner S=new Scanner(System.in);
System.out.print("enter any string :");
String name=S.nextLine();
try{
Class<?>clazz=Class.forName(name);
System.out.println("class found "+clazz.getName());
}
catch(ClassNotFoundException e)
{
//System.out.println(e);
System.out.println("class not found "+e.getMessage());
}
}
}
