package CoreJava.Constructor;

//Constructor - A constructor in java is amethod which is same as the class name and it can be called/invoked when an instance/object of the class is created.
//Constructors dont have return type like void.
//Constructors should be created right after class.
public class ConstructorConcept {

    public ConstructorConcept(){
        System.out.println("Default Constructor");
    }

    public ConstructorConcept(int i){
        System.out.println("Single parametric constructor");
        System.out.println("The value of i " +i);
    }

    public ConstructorConcept(int i, int j){
        System.out.println("Double parametric Constructor");
        System.out.println("The value of i is "  + i);
        System.out.println("The value of j is " + j);
    }

    //Can a constructor be overloaded ?? - Yes a Constructor can be overloaded as we can have multiple methods of same name with different parameters.
    //A costructor will be called immediately when we create an object of a class.

    public static void main(String[] args) {
        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(10);
        ConstructorConcept obj2 = new ConstructorConcept(24,76);
    }
}
