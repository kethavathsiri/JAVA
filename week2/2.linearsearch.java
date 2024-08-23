//write a java to implement linear search?
import java.util.*;
class LinearSearch{
public static void main(String...args){
Scanner sc=new Scanner(System.in);
int n,i,key,f=0;
System.out.print("enter the size: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("enter the elements: ");
for(i=0;i<n;i++){
 a[i]=sc.nextInt();
}
System.out.print("enter the key to search:");
key=sc.nextInt();
for(i=0;i<n;i++){
if(key==a[i]){
f=1;
break;
}
}
if(f==1)
System.out.println("element found at location "+i);
else
System.out.println("element not found at location ");
}
}





