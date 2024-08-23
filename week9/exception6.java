import java.util.*;
class MyException extends Exception{
    String msg;
    public MyException(String msg)
    {
        this.msg=msg;
    }
    public void print()
    {
        System.out.println("message is: "+msg);
    }
}
public class exception6
{
    public static void main(String...args)
    {
    String msg;
Scanner sc=new Scanner(System.in);
System.out.println("enter the  message:");
msg=sc.nextLine();

        try{
            throw new MyException(msg);
        }
        catch(MyException e){
              e.print();
        }
    }
}
