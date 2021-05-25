package CoreJava.MethodOverridingInheritancePolymorphismConcepts;

public class TestCar {
    public static void main(String[] args) {

        //Static Polymorphism / compile time polymorphism - At the time of compilation Java will decide which method to call.
        BMW b = new BMW();
        b.start(); // its calling Start method from BMW class. Its the overrriden method ie same method present both in child and parent class.
        b.stop(); // Can inherit as it is present in Parent class
        b.refuel(); // Can inherit as it is present in Parent class
        b.theftsafety(); // present in child class
        b.Engine(); // Can access this method as it is present in the Superclass/Grandparent class which is extended by Car class.

        System.out.println("*****************");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        //c.theftsafety - theftsafety method is available in BMW Class. A child class can inherit from parent Class, but a Parent class cannot inherit any methods from child class

        System.out.println("*****************");

        // Upcasting/Top casting - Child class object can be created using Parent class reference Variable.
        Car c1 = new BMW(); //Also called - Dynamic Polymorphism/Run time polymorphism - Child class object can be referred by Parent class reference variable.
        c1.start();
        c1.stop();
        c1.refuel();
        //c1.theftsafety(); // in order to access theftsafety() we can only do it by Static Polymorphism / compile time polymorphism
                            // Only BMW reference variable can access the method in the child class BMW

        //Downcasting - Parent class object created by Child class reference variable. This is not possible.

        //BMW b2 =new Car();

        //We need to cast it to use to make new Car() as a BMW class object
        //BMW b1 = (BMW)new Car(); // Now the error is gone but it would result in ClassCastException
    }



}
