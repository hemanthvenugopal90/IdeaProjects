package CoreJava.AbstractionAndInterfaceConcept;
//Abstraction is a concept where only standard methods are available without any implementation.Abstraction can be achieved with either abstract classes or interfaces
//A class can have multiple parent interfacs but a particular class can have only one parent class, it cannot have multiple parent classes.
//interface - No method body, only method declaration. We define only method prototype without any method body. We cannot create the object of an interface in interface.
//interface cannot be instantiated
//static methods cannot be used in interface but variables are static in nature by default.
//abstract methods means without method body.
//in Interface we can achieve 100% Abstraction.
//using abstract class we can achieve partial abstraction. In abstract class we can also have non abstract methods also. We cannt create an object of an abstract class.
//Abstraction is a process of hiding the implementation details and showing only functionality to the user. And the logic will be defined in the corresponding child class.
public interface USBank {
    int min_bal = 100; //in interface by default variables will be static in nature.
   /* public void debit(){ // you cannot define a method body inside an interface, it will give an error.

    }*/

    public void debit();
    public void credit();
    public void transferMoney();
    public void trading();

}
