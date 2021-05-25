package CoreJava.Constructor;

public class ConstructorUsingInheritanceChildClass extends ConstructorUsingInheritanceParentClass {

    public ConstructorUsingInheritanceChildClass(){
                  // Super keyword is used to call parent class constructor
                  // super(); this will call default constructor. even if u dont use this deaulkt constructor in parent class will be called.
        super(); //by using this the parameterized constructor in parent class will be called. If you dont use this default constructor will be called
                //super(12,34);//Super keyword should always written inside the child class constructor and it should be the first statement.
               //Only one super keyword can be used.
              //This wil be called after creating an object of class
    }

    public ConstructorUsingInheritanceChildClass(int i){
        super(i); //This will be called after creating second object. In order to call more constructors in parent class u need to create a new object and a new constructor and use super keyword.
    }

    public ConstructorUsingInheritanceChildClass(int i,int j){
        super(i,j);// in order to call the other constructor we need to create another contructor with super constructor.
                    //This will be called after creating Third object.

    }

    public static void main(String[] args) {
        ConstructorUsingInheritanceChildClass obj = new ConstructorUsingInheritanceChildClass();//whenever i create an object of a class using inheritance the parent class constructor methods will be called.
        ConstructorUsingInheritanceChildClass obj1 = new ConstructorUsingInheritanceChildClass(25);
        ConstructorUsingInheritanceChildClass obj2 = new ConstructorUsingInheritanceChildClass(12,34);
    }
}
