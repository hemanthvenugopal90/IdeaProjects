package CoreJava;

public class CallByValueAndCallByRef {
    int p; // Declare Global Variable for Call by Reference
    int q;
    public static void main(String[] args) {

        CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
        int x = 100;
        int y = 200;
        obj.testsum(x, y); // Call by value / Pass by Value. We are passing value for a Copy of input parameters in the below method testsum(int a , int b).
        System.out.println(" the arguments of testsum() int a, int b will be updated with x and y values  "+ (x+y));

//***************************************//
         obj.p = 50;
         obj.q = 60;

         obj.swap(obj); // Call by Reference/ Pass by reference where we are passing the value of an object reference.
         //after swap
        System.out.println(obj.p);
        System.out.println(obj.q);

    }

   // call by value
   public int testsum(int a,int b){ // we are passing an updated copy of these values in the main method
        a = 20;
        b = 30;
      int c = a+b;
        return c;
   }

   // Call by ref
   public void swap(CallByValueAndCallByRef t){
        int temp;
        temp = t.p; // temp = 50
        t.p =t.q;  // t.p = 60
        t.q = temp; //t.q = 50
   }

}

