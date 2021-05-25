package CoreJava;

public class MethodOrFunctionOverloading {
    // Duplicate Methods with the same name are not allowed in Java
    // methods are independent t each other

    //you cannot create a method inside a method
    //eg : public void sum(){
    //     sout("****");
    //           public void diff(){
    //      sout(*&%%);
    //}}

    //Same methods which have same method name with same parameters are not allowed. It should have different parameters
    //eg: public void Sum()
    //    {
    //     sout("Sum Method -- Zero Parameters");
    //    }
    //    public void Sum()
    //    {
    //     sout("Sum Method -- Zero Parameters");
    //    }
    public static void main(String[] args) {

        MethodOrFunctionOverloading obj = new MethodOrFunctionOverloading();
        obj.sum();
        obj.sum(15);
        obj.sum(30,40);

    }


    //Method Overloading - is a concept when the Method name is same with different arguments or input parameters with different datatypes within the same class
    public void sum(){ //--> Zero input parameter
        System.out.println("Sum Method with Zero Parameter");

    }

    public void sum(double d){ //--> one double input parameter
        System.out.println("Sum Method with double input Parameter");

    }


    public void sum(int i){ //--> 1 input parameter
        System.out.println("Sum Method with one Parameter");
        System.out.println(i);
    }

    public void sum(int k,int l){ //--> 2 input parameter
        System.out.println("Sum method with two Parameters");
        System.out.println(k+l);
    }

    // Can we Overload Main Method ?? Yes we can overload main method by giving different input parameters.
    public static void main(int i) {
        System.out.println("Main Method can be overloaded with diffrent parameters");
    }

    public static void main(String s) {
        System.out.println("***************");

    }
}
