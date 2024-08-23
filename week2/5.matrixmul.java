//write a java program to implement multiplication of matrix?import java.util.*;
import java.util.*;
class Matrix{
public static void main(String...args){
Scanner sc=new Scanner(System.in);
int r1,r2,c1,c2,j,i,k;
System.out.print("enter the size of row and column of 1st matrix: ");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.print("enter the size of row and column of 2nd matrix: ");
r2=sc.nextInt();
c2=sc.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c2];
if(c1==r2){
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
  for (i = 0; i < r1; i++) {//resultant matrix
      for (j = 0; j < c2; j++) {
      	 c[i][j] = 0;
        for (k = 0; k < c1; k++) {//condition
         c[i][j] = c[i][j]+ a[i][k]*b[k][j];
    }
    }    
    }
    
    System.out.print("Product of the matrices:\n");
 
    for (i = 0; i < r1; i++) {//resultant matrix
      for (j = 0; j < c2; j++){ 
        System.out.printf("%d\t", c[i][j]);
        }
 System.out.print("\n");
 }
}
else{
System.out.println("MATRIX MULTIPLICATION NOT POSSIBLE ");

 }
 }
 }

