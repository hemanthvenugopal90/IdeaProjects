package CoreJava.MethodOverridingInheritancePolymorphismConcepts;
//Child Class
// IQ - This is called 'has - a relationship' which means Inheritance as it uses extends keyword.
public class BMW extends Car {

    //Method Overriding/Polymorphism - When same methods is present in both parent class as well as Child class with same name and same number of arguments, it is called Method Overriding
    public void start(){ // Whenever a method is common in both child class and parent class like same method name start() with zero arguments -
                         // the preference would be given to child class method when it is called.
        System.out.println("BMW --> Start");
    }

    public void theftsafety(){
        System.out.println("BMW --> theftsafety");
    }
}
