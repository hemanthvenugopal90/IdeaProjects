package CoreJava;

public class StringConcatenation {
    public static void main(String[] args) {
        //'+' is concatenation operator
        //print is used to print on the console on the same line
        //println is used t print on the console on a different line
        int a = 100;
        int b = 200;

        String x = "Hello";
        String y = "World";

        double c = 15.67;
        double d = 24.89;

        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y); //left to right execution
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        System.out.println((x+y)+(a+b));
        System.out.println(c+d);
        System.out.println("The message that i wanna say to the world is " +(x + y));
        System.out.println("the answer of a + b is: " +(a+b));
        System.out.println(a+b+x+y+c+d);

        System.out.print("Hemanth");
        System.out.println("Venugopal");
    }
}
