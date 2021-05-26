package CoreJava;

public class FunctionsOrMethodsInJava {

    //Main Method is starting point of execution.
    //Main Method is a static method
    // Why Main method is void?? - Void does not return a value... main method does not return any value , hence it is void.
    public static void main(String[] args) { //main() is also a method. Functions are independent to each other. We cannot create a method inside a method. So other methods should be created outside of main().
         //Java will execute main() by default. other methods outside of main() should be called by creating instance of an object.
        FunctionsOrMethodsInJava obj=new FunctionsOrMethodsInJava();
        //new FunctionsOrMethodsInJava(); - this is the object
        //one object will be created,obj is the reference variable,referring to this object.
        //After creating the object, the copy of all non static methods will be given to this object
        // Objects cannot own Static Methods like Main(), Objects own only non static methods below
        // If you want to call non static methods of any class, an object needs to be created.

        obj.test();
        obj.testnew();
        obj.testnew1();

        //calling int methods in testnew() method
        int l = obj.testnew();
        System.out.println(l);

        //calling string methods in testnew1() method
        String n = obj.testnew1();
        System.out.println(n);

        int m =obj.division(30,10);
        System.out.println(m);


    }
        // Below are non static methods
        //void - Does not return any value
        //void - return type
        public void test(){ //no input no output

        System.out.println("Test Method");
        }

        // return type - int
        public int testnew(){ // no input some output
            System.out.println("testnew method");
            int a = 15;
            int b = 20;
            int c = a + b;
            return c; //since your returning c which is integer hence we need to use return type as int in the method.
        }
        //return type ->String
        public String testnew1(){ // no input some output
            System.out.println("testnew1 method");
            String s = "Hemanth";
            return s;

        }

        // Division method return type is int .. as it is passing integers as arguments
        // int a , int b are arguments here
        public int division(int x, int y){
            System.out.println("**Division**");
            int d = x/y;
            return d;
        }
    }
