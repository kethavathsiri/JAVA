//write a java program to implement sorting of names?
import java.util.*;

class NameSort{
public static void main(String...args){
Scanner sc=new Scanner(System.in);
int n,i,j;
String t;
System.out.print("enter number of names:");
n=sc.nextInt();
sc.nextLine();
String s[]=new String[n];
System.out.print("enter the strings: ");
for(i=0;i<n;i++){
s[i]=sc.nextLine();
}
for(i=0;i<n;i++){
 for(j=i+1;j<n;j++){
 if(s[i].compareTo(s[j])>0){
 t=s[i];
 s[i]=s[j];
 s[j]=t;
 }
 }
 }
 System.out.println("sorted order of names:\n");
for(i=0;i<n;i++){
System.out.println(s[i]+" ");
}
}
}


