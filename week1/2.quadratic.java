/*import java.util.Scanner;
class Quadratic{
public static void main(String[] siri){
Scanner sc=new Scanner(System.in);
double a,b,c;
double r1,r2,D;
System.out.print("enter the values: ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
D=b*b-4*a*c;
r1=(-b+Math.sqrt(D))/2*a;
r2=(-b-Math.sqrt(D))/2*a;
double real=-b/(2*a);
double imaginary=Math.sqrt(-D)/(2*a);
if(D==0)
System.out.println("roots are real and equal: " +r1 +"\n" +r2);
else if(D>0)
System.out.println("roots are real and distrinct: " +r1 +"\n" +r2);
else if(D<0)
System.out.println("both roots are complex or imaginary: "+real+"+"+imaginary+"i");
System.out.println(+real+"-"+imaginary+"i");
}}
}
*/
//quadratic 
import java.util.Scanner;

class ImaginaryRoots {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients a, b, and c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b*b - 4*a*c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2*a);

            System.out.println("Real Roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            double realPart = -b / (2*a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2*a);

            System.out.println("Imaginary Roots:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
