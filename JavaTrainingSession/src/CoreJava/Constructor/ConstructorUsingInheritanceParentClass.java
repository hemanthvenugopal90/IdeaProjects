package CoreJava.Constructor;

public class ConstructorUsingInheritanceParentClass {

    public ConstructorUsingInheritanceParentClass(){
        System.out.println("Parent class constructor will be called First after creating an object in child class");
    }

    public ConstructorUsingInheritanceParentClass(int i){
        System.out.println("Single Parameterized Constructer will be called : " +i);
    }

    public ConstructorUsingInheritanceParentClass(int i, int j){
        System.out.println("Two parametrized constructor will be called");
        System.out.println("The value of i will be called upon using Super Keyword " +i);
        System.out.println("The value of j will be called upon using Super Keyword " +j);
    }
}
