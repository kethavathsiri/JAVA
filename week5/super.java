//import java.scanner.*;
/*class Super{
void show(){
 System.out.println("rgukt basar");
 }
 
 class change extends Super{
 void show(){
 super.show();
 }
 }
 
//class Test{ 
 public static void main(String...siri){
    System.out.println("hlo");
    }
    }*/
   
  class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat(); // Calls the eat method of the immediate parent class (Animal)
        System.out.println("Dog is eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

 class SuperExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Calls the overridden eat method in Dog class, which in turn calls the eat method of Animal class using super
        myDog.bark(); // Calls the bark method in Dog class
    }
}




     
  
