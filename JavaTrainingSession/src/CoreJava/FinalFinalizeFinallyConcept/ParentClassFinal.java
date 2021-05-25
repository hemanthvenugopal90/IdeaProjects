package CoreJava.FinalFinalizeFinallyConcept;

public class ParentClassFinal {
//public final class ParentClassFinal {
       // To prevent inheritance also we use final keyword

    public void start(){
    //public final void start(){    //Method Overriding - Same method wth same number of Arguments present in both the class
        //to prevent Method Overriding also we use Final Keyword
        System.out.println("Parent Class --> Start Method");
    }
}
