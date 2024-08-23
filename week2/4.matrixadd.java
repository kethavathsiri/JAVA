//write a java program to implement addition of matrix?
import java.util.*;
class AddMatrix{
public static void main(String...args){
Scanner sc=new Scanner(System.in);
int r1,r2,c1,c2,j,i;
System.out.print("enter the size of row and column of 1st matrix: ");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.print("enter the size of row and column of 2nd matrix: ");
r2=sc.nextInt();
c2=sc.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c1];
if(r1==r2&&c1==c2){
System.out.print("enter the elements of 1st matrix: ");
for(i=0;i<r1;i++){
 for(j=0;j<c1;j++){
  a[i][j]=sc.nextInt();
  }
  }
System.out.print("enter the elemnets of 2nd matrix: ");
for(i=0;i<r2;i++){
 for(j=0;j<c2;j++){
 b[i][j]=sc.nextInt();
 }
}
for(i=0;i<r1;i++){
 for(j=0;j<c1;j++){
 c[i][j]=a[i][j]+b[i][j];
 }
 }
System.out.println("Addition of matrix ");
for(i=0;i<r1;i++){
 for(j=0;j<c1;j++){
 System.out.print(c[i][j]+" ");
 }
 System.out.print("\n");
 }
 }
else{
System.out.println("MATRIX ADDITION IS NOT POSSIBLE ");
}
}
 }

 

