//package pack;
import java.util.*;
import java.io.*;

class Consumer extends Thread {
    public void run() {
        try {
            int i = 0;
            while (true) {
                System.out.println("Production status is not over");
                Thread.sleep(1000);
                i++;
               if (i >= 10) {
                    break; // Assuming you want to break out of the loop after 10 iterations
                }
               
            }
             System.out.println("Production is over");
            
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        Consumer c1 = new Consumer();
        //Consumer c2 = new Consumer();
        c1.start();
        // c2.start();
    }
}

