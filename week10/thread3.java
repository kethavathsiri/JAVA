package pack;
import java.io.*;
class traffic extends Thread{
 public void run(){
  try{
  for(int i=0;i<2;i++){
  System.out.println("red is glow ");
  Thread.sleep(1000);
  System.out.println("red will put to off ");
  System.out.println("yellow will start glowing ");
  Thread.sleep(1000);
  System.out.println("yellow will put to off ");
  System.out.println("green will start glowing ");
  Thread.sleep(1000);
  System.out.println("green will put to off ");
  System.out.println();
  }
  }
  catch(Exception e){
  System.out.println("exception handled ");
  }
  }
  class Thread2{
  public static void main(String...args){
  traffic t=new traffic();
  t.start();
  }
  }
  }
