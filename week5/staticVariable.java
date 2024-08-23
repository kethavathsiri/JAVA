//static varaible
import java.lang.*;
class Test{
 static int c=0;
  Test(){
  c++;
  System.out.print(c);
  }
  
  public static void main(String...siri){
  Test obj1=new Test();
  Test obj2=new Test();
  Test obj3=new Test();
  }
 } 
