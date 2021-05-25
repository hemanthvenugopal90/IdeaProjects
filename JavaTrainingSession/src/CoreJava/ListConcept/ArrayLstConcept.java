package CoreJava.ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLstConcept {

    public static <E> void main(String[] args) {
        int a[] = new int[3]; //Static Array -- Size is Fixed

        //Arraylist - Dynamic Array
        //Can contain Duplicate values and elements
        //Maintains Insertion order
        //Synchronized
        //Allows random access to fetch the elements because it stores the values on the basis of Index
        //Can add values of any data type like int, char, string, boolean etc

        ArrayList ar = new ArrayList(); // non generic Arraylist object because we have not defined or generalized any data type over here
        ar.add(30);
        ar.add(20);
        ar.add(50);
        ar.add("Hemanth");
        ar.add('c');
        ar.add(15.567);
        ar.add(true);

        System.out.println(ar.size()); //Size of an arraylist
        System.out.println(ar.get(4)); // to get the value from an index
        System.out.println(ar.get(6));

        //in order to print all the values from an arraylist
        //1. using for loop
        //2. Using iterator

        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        //Non generic vs generic:
        ArrayList<Integer> ar1 = new ArrayList<Integer>(); // Integer type Arraylist - Generic Arraylist
        ar1.add(12);
        ar1.add(13);
        //ar1.add("selenium"); Not Allowed

        ArrayList<String> ar2=new ArrayList<String>(); //String type Arraylist - Generic Arraylist
        ar2.add("Pavan");
        ar2.add("Lakshmi");

        ArrayList<E> ar3 = new ArrayList<E>(); // This is rarely used .. suppose if we want to declare any data type we can use <E>. It should also be defined next to void in main method

        System.out.println("******Defining user- defined class object Arraylist********");

        //Employee class objects
        Employee e1 = new Employee("Hemanth",30,"QA");
        Employee e2 = new Employee("Suman", 35, "Developer");
        Employee e3 = new Employee("Lakshmi", 55, "CEO");

        //Create Arraylist:
        ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        //iterator to traverse the values

        Iterator<Employee> it =ar4.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

        //**********//

        System.out.println("***************");

        //addAll()
        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("Test");
        ar5.add("Selenium");
        ar5.add("QTP");

        ArrayList<String> ar6 = new ArrayList<String>(); //addAll() method adds the second list object into the First List - Merges two arraylist
        ar6.add("Tester");
        ar6.add("RestAssured");
        ar6.add("JAVA");

        ar5.addAll(ar6);

        for(int i=0;i<ar5.size();i++){
            System.out.println(ar5.get(i));
        }

        //removeAll():
        ar5.removeAll(ar6);
        for(int i=0;i<ar5.size();i++){
            System.out.println(ar5.get(i));
        }

        System.out.println("**************Retain all method**************");

        //retainAll() - Only the common element in both the arraylist will be printed
        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("Hemanth is");
        ar7.add("going to");
        ar7.add("Australia");

        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("Pavan is");
        ar8.add("going to");
        ar8.add("Australia");

        ar7.retainAll(ar8);
        for(int i=0;i<ar7.size();i++){
            System.out.println(ar7.get(i));
        }

    }
}
