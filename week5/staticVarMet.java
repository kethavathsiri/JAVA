class Example {
    // Static variable
    static int staticVariable = 5;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
}
class StaticExample {
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static variable: " + Example.staticVariable);

        // Calling static method
        Example.staticMethod();

        // Creating an instance of the class to access non-static method
        Example instance = new Example();
        instance.nonStaticMethod();
    }
}

