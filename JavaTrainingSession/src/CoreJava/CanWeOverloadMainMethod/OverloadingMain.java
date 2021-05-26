package CoreJava.CanWeOverloadMainMethod;

public class OverloadingMain {
//IQ - Can main() be overloaded
    //Yes it can be overloaded
    //But JVM will look for the Signature Main method  public static void main(String[] args) and will execute it first
    //In order for other static methods to be called, call them by direct calling or by creating objects
    public static void main(String[] args) {
        System.out.println("Can Main() be overloaded???");

        main("hemanth");
        main(25);
        main(56,75);
    }

    public static void main(String s) {
        System.out.println("Yes it can be overloaded");

    }

    public static void main(int a) {
        System.out.println("But JVM will look for the Signature Main method  public static void main(String[] args) and will execute it first");

    }

    public static void main(int a, int b) {
        System.out.println("In order for other static methods to be called, call them by direct calling or by creating objects ");

    }
}
