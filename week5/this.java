//this keyword
//which is used to refer current class instance varaible;
import java.util.*;
class This{
 int id;//instance varaible
 String name;//instance varaible
 void insertval(int id,String name){
       this.id=id;
        this.name=name;
 }
 void display(){
 System.out.print("id: "+id+" \nname: "+name+"\n");
 }
 }
class test{
 public static void main(String...siri){
 Scanner sc=new Scanner(System.in);
 System.out.print("enter the id:");
 int a=sc.nextInt();
 sc.nextLine();
 
 System.out.print("enter the name:");
 String b=sc.nextLine();
 This s=new This();
 s.insertval(a,b);
 s.display();
 }
 }
 
