package CoreJava;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        int j = i++; // post increment
        System.out.println(i);
        System.out.println(j);

        //pre increment
        int a=1;
        int b=++a;
        System.out.println(a);
        System.out.println(b);

        //post decrement
        int m = 1;
        int n = m--;
        System.out.println(m);
        System.out.println(n);

        //pre decrement
        int k = 1;
        int l = --k;
        System.out.println(k);
        System.out.println(l);
        

    }
}
