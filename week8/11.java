// File: mypackage/ClassA.java
package mypackage;

 class ClassA {
    public static void methodA() {
        System.out.println("Method A from ClassA");
    }
}



 class ClassB {
    public static void methodB() {
        System.out.println("Method B from ClassB");
    }
}
class ClassC{
   public static void methodC(){
   System.out.println("Method C from ClassC");
    }
}
    
 class ClassD {
    public static void main(String[] args) {
        ClassA.methodA();
        ClassB.methodB();
        ClassC.methodC();
        System.out.println("Main method in ClassD");
    }
}

