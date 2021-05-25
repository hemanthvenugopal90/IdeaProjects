package CoreJava;

public class StaticAndNonStaticConcepts {

    String name = "Hemanth"; // Non Static variables
    static int age = 25; // Static Variables

    public static void main(String[] args) {
        //How to call Static Methods and variables?
        //1. By Direct Calling
        sum();
        //2. calling by class name
        StaticAndNonStaticConcepts.sum();

        System.out.println(age);
        System.out.println(StaticAndNonStaticConcepts.age);

        //how to call non static methods and variables - By creating Object
        StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();
        obj.sendmail();
        System.out.println(obj.name);

        //Can i access Static Methods using object reference ? Yes we can access but its not a good practice and it would give a warning
        obj.sum();
    }

    public void sendmail(){ //non Static method
        System.out.println("Non static methods and variables can only be called by creating objects");
    }

    public static void sum(){ //Static Method
        System.out.println("Static Methods can be accessed by direct calling or calling by classname");
    }
}
