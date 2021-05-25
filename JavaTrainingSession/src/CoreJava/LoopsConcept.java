package CoreJava;

public class LoopsConcept {
    public static void main(String[] args) {

        //1.while loop
        //disadvantage : it will generate infinite loop if you don't give incremental/decremental

        int i = 1; //initialization
        while(i<=10){ //condition
            System.out.println(i);
            i=i+1; //incremental/decremental
        }

        System.out.println("****************");

        //2.for loop

        for (int j=1;j<=10;j++){
            System.out.println(j);
        }

        System.out.println("&^%&*^%*&^%*&^%");

        for(int k=10;k>=1;k--){
            System.out.println(k);
        }

        System.out.println("!@#%^(&*^*&^$#$");

        for(int k=10;k>=-10;k--){
            System.out.println(k);
        }
    }
}
