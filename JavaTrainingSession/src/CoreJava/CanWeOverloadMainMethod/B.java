package CoreJava.CanWeOverloadMainMethod;

public class B {
    public static void main(String[] args) {
        System.out.println("calling this method");
        //A.main(args); - this will return error
    }
}
