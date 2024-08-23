/*4. Write a Program using Threads for the following case study: Movie Theatre
To watch a movie the following process is to be followed, at first get the ticket then show
the ticket. Assume that N persons are trying to enter the Theatre hall all at once, display
their seuence of entry into theater.
Note: The person should enter only after getting a ticket and showing it to the boy.*/

import java.util.Scanner;
class entrance{
synchronized public void enter(int y){
System.out.println("Person "+y+" showed the ticket to the boy");
}
synchronized public void show(int y){
System.out.println("Person "+y+" entered the Theatre");
}
}
class person extends Thread{
int y;
entrance e;
person(int y,entrance e){
this.e=e;
this.y=y;
}
public void buyticket(){
System.out.println("Person "+y+" bought the ticket");
}
public void run(){
buyticket();
e.enter(y);
e.show(y);
}}
class TheaterThread{
public static void main(String args[]){ 
Scanner sc=new Scanner(System.in); 
System.out.print("Enter the no of persons:");
int n=sc.nextInt();
person p[]=new person[n+1];//array 
entrance e=new entrance();//object creation
for(int i=1;i<=n;i++)
p[i]=new person(i,e);
for(int i=1;i<=n;i++)
p[i].start();
}}

/*
import java.util.Scanner;

class TicketBooth {
    private static int availableTickets;

    public static synchronized void getTicket(String personName) {
        if (availableTickets > 0) {
            System.out.println(personName + " got a ticket.");
            availableTickets--;
        } else {
            System.out.println(personName + " couldn't get a ticket. No tickets available.");
        }
    }

    public static synchronized void showTicket(String personName) {
        System.out.println(personName + " showed the ticket.");
    }

    public static synchronized void enterTheatre(String personName) {
        System.out.println(personName + " entered the Theatre hall.");
    }

    public static synchronized void setAvailableTickets(int tickets) {
        availableTickets = tickets;
    }
}

class Person extends Thread {
    private String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    //@Override
    public void run() {
        TicketBooth.getTicket(personName);
        TicketBooth.showTicket(personName);
        TicketBooth.enterTheatre(personName);
    }
}
 class MovieTheatreSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get initial number of tickets from the user
        System.out.print("Enter the initial number of tickets: ");
        int initialTickets = scanner.nextInt();
        TicketBooth.setAvailableTickets(initialTickets);

        // Get the number of persons trying to enter the Theatre hall
        System.out.print("Enter the number of persons trying to enter the Theatre hall: ");
        int numberOfPersons = scanner.nextInt();

        // Start the simulation
        for (int i = 1; i <= numberOfPersons; i++) {
            Person person = new Person("Person" + i);
            person.start();
        }

        
    }
}*/

