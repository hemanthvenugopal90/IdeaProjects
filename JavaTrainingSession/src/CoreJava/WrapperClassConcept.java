package CoreJava;

public class WrapperClassConcept {
    // Interview question - How do you convert string to integer or double to string ? Answer - Using Wrapper Class
    // data conversion from string to int, string to boolean, int to string etc is possible using Wrapper Classes
    public static void main(String[] args) {
        String x = "100";
        System.out.println(x + 200);

        //data conversion String --> int
        int i = Integer.parseInt(x); // using this wrapper class parseInt(x) we can perform data conversion
        System.out.println(i + 200);

        //data conversion String --> double
        String d = "45.78";
        System.out.println(d + 30);

        double e = Double.parseDouble(d);
        System.out.println(e + 30);

        // String to Boolean

        String t = "true";
        Boolean b = Boolean.parseBoolean(t);
        System.out.println(b);

        // int to String

        int h = 1000;
        System.out.println(h + 200);

        String g = String.valueOf(h);
        System.out.println(g + 200);

        // Interview question - When do you get NumberFormatException exception?
        //String q = "100u";
        //int a = Integer.parseInt(q);
        //System.out.println(a);

        // 100u is not the correct input string to convert into integer...

    }

}
