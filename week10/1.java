import java.io.*;
class MyThread extends Thread {
 public void run(){
  for(int i=1;i<=5;i++){
  //int i=0;
  //while(true){
   System.out.println("Thread creation: "+i++);
   }
   }
   }
   class Main{
   public static void main(String[] args){
   MyThread m=new MyThread();
   m.start();
   //int i=0;//it is a method on a Thread object,which internally calls the run() method
   for(int i=1;i<=5;i++){
   //while(true){
   System.out.println("Main method: "+i++);
   //}
   }
   }
   }
  
  
