//print minimum and maximum elements
import java.util.*;
class Great{
public static void main(String...hi){
//array declaration 
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
int n,i;
System.out.print("enter the array elements:");
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
int max=a[0];
int min=a[0];
for(i=1;i<a.length;i++){
if(a[i]>max){
max=a[i];}
if(a[i]<min){
min=a[i];
}
}
System.out.println("minimum="+min);
System.out.println("maximum="+max);
}
}





