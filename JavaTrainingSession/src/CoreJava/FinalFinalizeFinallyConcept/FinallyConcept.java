package CoreJava.FinalFinalizeFinallyConcept;

public class FinallyConcept {
    public static void main(String[] args) {
        test1();

        test2();

        division();
    }
//Finally Keyword is always used within try and Catch Block
//Finally Code will always be executed within Finally Block. Whatever is written within the Finally block will get executed after try/catch Block.
    public static void test1(){
        try{
            System.out.println("Inside Start method");
            throw new RuntimeException("test");
        }catch(Exception e){
            System.out.println("Inside catch Block");
        }
        finally {
            System.out.println("Inside Finally block");
        }

    }

    public static void test2(){
        try{
            System.out.println("Inside test 2 method");
        }
        finally {
            System.out.println("Finally code in test 2 method");
        }
       //Finally block will be executed without giving try catch also. It will be executed even if there are any exceptions.
    }

    public static void division() {
        int i = 10;
        try {
            System.out.println("Inside Division Method");
            int k = i/0; //According to java anything divided by zero gives infinity and cannot be handled by java.
        }

        catch (ArithmeticException e){
            System.out.println("Inside Catch Block");
         System.out.println("Divide by zero Error");
        }

        //Interview Question
       // catch(NullPointerException e){ // According to try block above this should result in a Arithmetic Exception but we are Catching a Null Point Exception
                                        //So finally block will execute and return an exception in this case
         //   System.out.println("Null pointer Exception");
       // }


        finally { //Finally is a block
            System.out.println("Execute this code even after any exception");
        }


    }
}


