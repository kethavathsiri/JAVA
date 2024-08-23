/*2.A mail-order house sells five products whose retail prices are as follows : Product
1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50
and Product 5 : Rs. 40.49 . Each product has Prdouct_Id, Product_Name,
Product_Quantity, Product_Price. Write an application that reads a series of pairs of
numbers as follows :
a) product Id
b) quantity sold
your program use a switch statement to determine the retail price for each product.
it should calculate and display the total retail value of all products sold.*/
import java.util.*;


/*class Product {
    public static void main(String...siri) {
        int productId, quantitySold;
        double totalRetailValue = 0;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("enter the product id: ");
            productId = sc.nextInt();

            if(productId==0) {// enter 0 to stop the product id
                break;
            }

            System.out.print("enter the quantity sold:");
            quantitySold = sc.nextInt();

            switch (productId) {
                case 1:
                    totalRetailValue += 99.90 * quantitySold;
                    break;
                case 2:
                    totalRetailValue += 22.20 * quantitySold;
                    break;
                case 3:
                    totalRetailValue += 6.87 * quantitySold;
                    break;
                case 4:
                    totalRetailValue += 45.50 * quantitySold;
                    break;
                case 5:
                    totalRetailValue += 40.49 * quantitySold;
                    break;
                default:
                    System.out.println("INVALID ENTRY: Product ID should be between 1 and 5");
            }
        }

        System.out.println("Total retail value of products sold Rs=" + totalRetailValue);
    }
}*/


class Product{
public static void main(String...siri){
int productId,quantitySold;
double retailValue,totalRetailValue=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter -1 to stop the product id");
while(true){
System.out.print("enter the product id: ");
productId=sc.nextInt();

if(productId==-1){//enter 0 to stop the product id
break;
}
System.out.print("enter the quantity sold:");
quantitySold=sc.nextInt();
switch(productId){
case 1:retailValue=99.90; break;
case 2:retailValue=22.20; break;
case 3:retailValue=6.87; break;
case 4:retailValue=45.50; break;
case 5:retailValue=40.49; break;
default:
System.out.println("INVALID ENTRY:");
continue;//skip to the next iteration of the loop
}
totalRetailValue+=retailValue*quantitySold;
}
System.out.println("Total retail value of product sold Rs="+totalRetailValue);
}
}


