package CoreJava;

public class IfElseConcept {
    public static void main(String[] args) {
        int a = 70;
        int b = 50;

        if(a>b) {
            System.out.println("a is greater than b");
        }else{
                System.out.println("b is greater than a");
            }
        //comparison operators
        //<, >, <=, >=, !=, ==


        int c = 40;
        int d = 50;
        if(c==d){
            System.out.println("Both c and d are equal");
    }else{
            System.out.println("Both c and d are not equal");
        }

        //write a logic to find the highest number

        int a1=100;
        int b1=2000;
        int c1=300;

        if(a1>b1 && a1>c1){
            System.out.println("a1 is greatest");
        }else if(b1>c1) {
            System.out.println("b1 is greatest");
        }else{
                System.out.println("C1 is greatest");
            }

        }

    }
