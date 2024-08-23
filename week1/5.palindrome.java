import java.util.*;
class Palindrome{
public static void main(String...siri){
Scanner sc=new Scanner(System.in);
int sum=0,rem,n,t;
System.out.println("enter the number:");
n=sc.nextInt();
t=n;
while(n!=0){
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
if(sum==t)
System.out.println(t+" is palindrome");
else
System.out.println(t+" is not palindrome");
}
}

