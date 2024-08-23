import java.util.*;
class PrimeFactor{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,i,j,count;
System.out.println("Enter the number:");
n=sc.nextInt();
System.out.println("prime factors are ");
for(i=1;i<=n;i++){
 if(n%i==0){
 count=0;
 for(j=1;j<=i;j++){
  if(i%j==0){
  count++;
  }
 }
 if(count==2)
 System.out.println(i);
 }
 }
 }
 }


