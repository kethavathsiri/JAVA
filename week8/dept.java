package department;
import java.util.*;
import dept.Cse;
import dept.Ece;
import dept.Me;
import dept.Ce;

class department{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  /*Cse c=new Cse();
  Ece e=new Ece();
  Me m=new Me();
  Ce s=new Ce();
   System.out.println("Displaying Subjects for Each Department:");
        System.out.println("--------------------------------------");
        c.subjects();
        System.out.println();
        e.subjects();
         System.out.println();
         m.subjects();
          System.out.println();
          s.subjects();
           System.out.println();
           }
           }*/
           while(true){
           
           System.out.println("Choose a Department:");
        System.out.println("1. CSE");
        System.out.println("2. ECE");
        System.out.println("3. ME");
        System.out.println("4. CE");
        System.out.print("\nEnter your choice (1-4): ");
        //System.out.println();
        int choice = sc.nextInt();
        if(choice==0){
        System.out.println("Exited the program ");
        break;
        }
        
        switch(choice){
        case 1:
                Cse c= new Cse();
                c.subjects();
                System.out.println();
                break;
            case 2:
                Ece e= new Ece();
                e.subjects();
                System.out.println();
                break;
            case 3:
                Me m = new Me();
                m.subjects();
                System.out.println();
                break;
            case 4:
                Ce s = new Ce();
                s.subjects();
                System.out.println();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                System.out.println();
        }
        }
        }
}
        
        
  

