package CoreJava;

public class ArrayConcept {

    public static void main(String[] args) {

        //array: to store a similar data ty[e values in a array variable
        //one dimensional array

        //int array
        //lowest bound/index = 0
        //highest bound/index = n-1(n is size of the array)
        int i[] = new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);

       // System.out.println(i[4]); //- this will give index out of bound exception

        System.out.println(i.length);

        System.out.println("**********************");

        //print all the values of array using for loop
        for(int j=0;j<i.length;j++){
            System.out.println(i[j]);
        }

        for(int j=0;j<i.length;j++){
            System.out.println(j);
        }

        //double array
        double k[]=new double[4];
        k[0]=13.45;
        k[1]=14.78;
        k[2]=13.67;

        System.out.println(k[1]);

        //char array
        char c[] = new char[4];
        c[0]='c';
        c[1]=2;
        c[2]='j';
        c[3]=23;

        System.out.println(c[2]);

        //boolean array
        boolean b[]=new boolean[4];
        b[0]=true;
        b[1]=false;
        System.out.println(b[0]);


        //string array
        String s[]=new String[2];
        s[0]="Hemanth";
        s[1]="pavan";

        System.out.println(s.length);
        System.out.println(s[1]);


        //disadvantage of array
        //1.size is fixed --> Static array// to overcome this we use Collections -- Arraylist, Hashtable
        //2. Stores only similar data types like int,char,double... it only stores a particular data type values
        // to overcome this we use Object array.
        //Object array is used to store different data type values.
        System.out.println("******Object Array******");
        // Object array : object is a class. It is a superclass in Java.

        Object ob[]=new Object[6];
        ob[0]=30;
        ob[1]=94.678;
        ob[2]='a';
        ob[3]="Hemanth";
        ob[4]="06/12/1990";
        ob[5]="Bangalore";

        System.out.println(ob[3]);
        System.out.println(ob.length);

        //listing out all the elements using for loop

        for(int h=0;h<ob.length;h++){
            System.out.println(ob[h]);
        }

        for(int h=0;h<ob.length;h++){
            System.out.println(h);
        }


        System.out.println("********2 - Dimensional Array**********");

        // 2 dimensional array (Values are stored in the form of a matrix with rows and columns)
        String x[][]=new String[3][5];

        System.out.println(x.length); // Displays number of Rows = 3
        System.out.println(x[0].length); // Displays number of Columns = 5

        x[0][0] = "H";
        x[0][1] = "E";
        x[0][2] = "M";
        x[0][3] = "A";
        x[0][4] = "N";

        x[1][0] = "T";
        x[1][1] = "H";
        x[1][2] = "P";
        x[1][3] = "A";
        x[1][4] = "V";

        x[2][0] = "A";
        x[2][1] = "N";
        x[2][2] = "L";
        x[2][3] = "A";
        x[2][4] = "V";

        System.out.println(x[2][2]);
        System.out.println(x[1][3]);
        System.out.println(x[2][3]);
        System.out.println(x[2][0]);

        //print all the values of 2-D array : use two for loops

        System.out.println("*****Print all the values of 2 D array*******");
        //logic
        //row=0 col=0 to 4
        //row=1 col=0 to 4
        //row=2 col=0 to 4

        for(int row=0;row<x.length;row++){
            for(int col=0;col<x[0].length;col++){
                System.out.println(x[row][col]);
            }
        }

    }
}

