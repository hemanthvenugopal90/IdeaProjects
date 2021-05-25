package CoreJava;

public class ClassConcepts {
    //CLass Variables
    int mod;
    int wheel;
    String owner;

    public static void main(String[] args) {
        //new CLassConcepts() : This is the object of ClassConcepts CLass
        //new keyword is used to create the object
        // a, b, c - Object referrence variables / Object Name
        ClassConcepts a = new ClassConcepts();
        ClassConcepts b = new ClassConcepts();
        ClassConcepts c = new ClassConcepts();

        a.mod = 2015;
        a.wheel = 4;
        a.owner = "Hemanth";

        b.mod = 2016;
        b.wheel = 4;
        b.owner = "Pavan";

        c.mod = 2019;
        c.wheel = 4;
        c.owner = "Lakshmi";


        System.out.println("****Before assigning the references****");
        System.out.println(a.mod);
        System.out.println(b.wheel);
        System.out.println(c.mod);
        System.out.println(a.owner);

        System.out.println("****After assigning the references*****");
        a=b;
        b=c;
        c=a;

        a.mod = 30;
        System.out.println(a.mod);
        c.mod = 70;
        System.out.println(a.mod);
        System.out.println(c.mod);

    }
}
