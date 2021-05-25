package ListConcept;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListConcept {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.add("Australia");
        ll1.add("is the future");

        System.out.println("Linked list which prints only strings:" +ll1);

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(12);
        ll2.add(35);

        System.out.println("Linked List which prints only integers:" +ll2);

        LinkedList ll = new LinkedList();
        ll.add("Hemanth");
        ll.add("30 years old");
        ll.add("Software tester");
        ll.add("Australia");

        System.out.println("Content of list" +ll);

        //get()
        System.out.println(ll.get(0));
        System.out.println(ll.get(3));

        System.out.println("************");

        ll.addFirst("Pavan");
        ll.addLast("Melbourne");

        System.out.println("Content of list after add first and add last" +ll);

        System.out.println("******************");
        //set
        ll.set(0, "Lakshmi");
        ll.set(1, "55 years old");

        System.out.println("Content of List after Set method" +ll);

        System.out.println("************");
        //remove first and last
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Content of list after removing" +ll);

        ll.remove(2);
        System.out.println("Content of list after removing index 2:" +ll);


        // Interview question - What are the different ways to print linked list????
        //How to print all the values of Linked list
        //for loop
        System.out.println("*********Using For Loop************");
        for(int n=0;n<ll.size();n++){
            System.out.println(ll.get(n));
        }
        //advanced for loop
        System.out.println("************Advanced for loop***********");
        for(String str : ll1){
            System.out.println(str);
        }
        //using iterator
        System.out.println("**************using Iterator***********");

        Iterator<String> it=ll1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //while loop
        System.out.println("*******While loop************");

        int num = 0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }
    }
}
