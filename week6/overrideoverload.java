import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    // Method overriding
    //@Override
    void makeSound() {
        System.out.println("Bark");
    }

    // Method overloading
    void makeSound(int intensity) {
        if (intensity > 5) {
            System.out.println("Loud bark");
        } else {
            System.out.println("Soft bark");
        }
    }
}

 class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Method overriding example
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Calls the makeSound method of the Animal class

        Dog myDog = new Dog();
        myDog.makeSound();  // Calls the overridden makeSound method of the Dog class

        // Method overloading example with user input
        System.out.print("Enter the intensity of the dog's bark (an integer): ");
        int intensity = scanner.nextInt();
        myDog.makeSound(intensity);  // Calls the overloaded makeSound method with user input

        scanner.close();
    }
}

