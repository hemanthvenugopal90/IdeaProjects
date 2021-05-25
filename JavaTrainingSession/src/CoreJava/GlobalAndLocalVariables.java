package CoreJava;

public class GlobalAndLocalVariables {

    String name = "Hemanth"; // These are Global variable declared right after Class
    int age = 30;            // Global Variables can be accessed anywhere in the program by creating an object

    public static void main(String[] args) {
        int i = 20;           // these are local variables which are declared inside a method
        System.out.println(i);// local variables belong to that particular method only and cannot be accessed anywhere
        GlobalAndLocalVariables obj = new GlobalAndLocalVariables();
        System.out.println(obj.name);
        System.out.println(obj.age);

    }

    public void sum(){
        int i = 100;
        int h = 200;
    }
}
