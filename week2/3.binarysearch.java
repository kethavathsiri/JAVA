//write a java program to implement binary search?
import java.util.*;
class Binarysearch{
public static void main(String...args){
Scanner sc=new Scanner(System.in);
int n,i,j,key,mid,t;
System.out.print("enter the size: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("enter the element:");
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
System.out.print("Sorted elements :");
for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}
System.out.print("\nenter the key to search: ");
key=sc.nextInt();
int high=n-1,low=0;
while(low<=high){
mid=(low+high)/2;
if(key==a[mid]){
System.out.println("element location is "+mid);
System.exit(0);
}

else if(key>a[mid]){
low=mid+1;
}
else{
high=mid-1;
}
}
System.out.println("element is not found");
}
}



