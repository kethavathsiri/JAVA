import java.util.Scanner;
class bookticket{
static int totalberths;
bookticket(int x){
totalberths=x;
}
static int confirmedberths=0;
synchronized public void confirm(int y){
System.out.println("Number of available berths are: "+(totalberths-confirmedberths));
if(confirmedberths<=totalberths&&(totalberths-confirmedberths)!=0)
{
System.out.println("Berth confirmed for passenger "+y);
System.out.println("Ticket confirmed for passenger "+y+"with ticketnumber: "+"T"+y+confirmedberths);
}
else{
System.out.println("Berth not confirmed for passenger "+y+" ,births completely filled");
}
if(confirmedberths==totalberths) ;
else
confirmedberths++;
}}
class passenger extends Thread{
int y;
bookticket s;
public passenger(int x,bookticket e){
s=e;
y=x;
}
public void run(){
s.confirm(y);
}}
 class TrainThread{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no of berths in Train:");
int t=sc.nextInt();
System.out.print("Enter the no of passenger:");
int n=sc.nextInt();
passenger p[]=new passenger[n+1];
bookticket b=new bookticket(t);
for(int i=1;i<=n;i++)
p[i]=new passenger(i,b);
for(int i=1;i<=n;i++)
p[i].start();
}}
