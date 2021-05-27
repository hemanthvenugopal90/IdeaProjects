package CoreJava.AbstractionAndInterfaceConcept;

public abstract class Shape {

    Shape(){
        System.out.println("shape class constructor");
    }

    int color;

    abstract void drawing(); //abstract keyword is used to make a class abstract and method as abstract.

    public void fill(){ // we can have non abstract methods also
        System.out.println("Shape -- fill");
    }

    //cannot create the object of interface


}
