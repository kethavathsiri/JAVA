/*5. Create an Interface Fare with method getAmount() to get the amount paid for fare
of travelling. Calculate the fare paid by bus and train implementing interface Fare.*/

import java.util.Scanner;

interface Fare {
    double getAmount(double distance, double farePerKilometer);
}
class Bus implements Fare {
    //@Override
    public double getAmount(double distance, double farePerKilometer) {
        return distance * farePerKilometer;
    }
}
 class FareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus b1 = new Bus();

        System.out.print("Enter the distance traveled by bus (in km): ");
        double a = sc.nextDouble();
        System.out.print("Enter the fare per kilometer for bus: ");
        double b = sc.nextDouble();

        // Calculating and printing the bus fare
        double busFare = b1.getAmount(a, b);
        System.out.println("Bus Fare: $" + busFare);
    }
}

