//calculator program
import java.util.*;
class Calculator{
public static void main(String...siri){
Scanner sc=new Scanner(System.in);
int a,b;
char opt;
while(true){
System.out.println("enter the two values: ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("enter the operator: ");
opt=sc.next().charAt(0);
switch(opt){
case '+':System.out.println("sum="+(a+b)); break;
case '-':System.out.println("Substraction="+(a-b));break;
case '*':System.out.println("Mltiplication="+(a*b));break;
case '/':System.out.println("Division="+(a/b));break;
case '%':System.out.println("modulo="+(a%b));break;
default:System.out.println("Invalid");
System.exit(0);
}
}
}
}

