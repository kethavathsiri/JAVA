import java.util.*;
import java.io.*;
class CusException extends  Exception
{
CusException(String Msg)
{
super(Msg);
//this.Msg=Msg;
}
}
class exception2
{
public static void main(String[] arg)
{
try{
throw new CusException(" exception occured");
}
catch(Exception e)
{
System.out.println("caught exception:" +e.getMessage());
}
catch(CusException n)
{
System.out.println("caught exception:" +n.getMessage());
}
}
}
