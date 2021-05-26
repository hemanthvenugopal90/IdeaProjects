package CoreJava.CanWeOverloadMainMethod;
//main () can also be called from a different class .. and since it is static in nature only method name can be used to call it.
public class A {
    public static void main(String[] args) {
        System.out.println("Main method");
        B.main(args);
    }
}
