//1. sorting of elements?
import java.util.*;

class Sorting{
public static void main(String...siri){
Scanner sc=new Scanner(System.in);
int n,i,t,j;
System.out.print("enter the size: ");
n=sc.nextInt();
int a[]=new int[n];//array declaration
System.out.print("enter the elements:");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
 for(j=i+1;j<n;j++){
  if(a[i]>a[j]){
  t=a[i];
  a[i]=a[j];
  a[j]=t;
  }
  }
  }
System.out.println("Sorting of elements:");
for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}

