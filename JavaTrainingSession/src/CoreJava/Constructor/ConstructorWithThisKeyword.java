package CoreJava.Constructor;

public class ConstructorWithThisKeyword {
    //Class variable / Global variables
    String name;
    int age;

    public ConstructorWithThisKeyword(String name, int age){
        this.name = name; //this.global variable  = constructors variable
        this.age = age;

        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Hemanth", 30); /*Whenever we run the program these values will be given
        to the constructors arguments but if we want these value to be given to the Class variables we need to use this keyword.*/
    }

}
