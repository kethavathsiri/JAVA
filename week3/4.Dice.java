/*import java.util.*;
import java.util.Random;
class Dice{
 public static void main(String[] ar)
 {
   int n=0,dice1,dice2,i;
   int m=0;
   Scanner sc=new Scanner(System.in);
   Random r= new Random();
   dice1=r.nextInt(6);
   dice2=r.nextInt(6);
   for(i=0;i<10;i++)
   {
    System.out.println("enter the two numbers");
    dice1=sc.nextInt();
    dice2=sc.nextInt();
    
    if((dice1>=1&&dice1<=6)&&(dice2>=1&&dice2<=6)) 
    {
           if(dice1==dice2)
           {
           n++;
            }   
           else
           {
           m++;
           }
   }
   else
   {
   System.out.println("invalid numbers for dice");
   }
}
System.out.println("Successfull attempts="+n);
System.out.println("unsuccessfull attempts="+m);
}
}*/
/*import java.util.*;

class Dice {
    public static void main(String[] ar) {
        int n = 0, m = 0, dice1, dice2, i;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for (i = 0; i < 10; i++) {
            dice1 = r.nextInt(6) + 1;
            dice2 = r.nextInt(6) + 1;

            System.out.println("Enter the two numbers");
            // Uncomment the next two lines if you want to take input from the user
            // dice1 = sc.nextInt();
            // dice2 = sc.nextInt();

            if ((dice1 >= 1 && dice1 <= 6) && (dice2 >= 1 && dice2 <= 6)) {
                if (dice1 == dice2) {
                    n++;
                } else {
                    m++;
                }
            } else {
                System.out.println("Invalid numbers for dice");
                i--; // Decrement i to repeat the current iteration since the input was invalid
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Successful attempts = " + n);
        System.out.println("Unsuccessful attempts = " + m);
    }
}*/
import java.util.Random;

 class DiceRollingWithDelay {
    public static void main(String[] args) {
        int successfulAttempts = 0;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int dice1 = random.nextInt(6) + 1;//nextInt(6) + 1 generates a random integer between 1 and 6, 
            int dice2 = random.nextInt(6) + 1;

            System.out.println("Rolling the dice...");
            try {
                Thread.sleep(10000); // Introduce a delay of 10,000 ms (10 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

            if (dice1 == dice2) {
                System.out.println("Successful attempt!");
                successfulAttempts++;
            } else {
                System.out.println("Unsuccessful attempt.");
            }

            System.out.println(); // Add a line break for better readability
        }

        System.out.println("Total successful attempts: " + successfulAttempts);
    }
}


