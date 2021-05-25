package CoreJava.ListConcept;

public class Employee {
    String name;
    int age;
    String dept;

    Employee(String name, int age, String dept){
        this.name = name; //Whenever the global variable and local variable are same we will have to user this keyword
        this.age = age;
        this.dept = dept;
    }
}
