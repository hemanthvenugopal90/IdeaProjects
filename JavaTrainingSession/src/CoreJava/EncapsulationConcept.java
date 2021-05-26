package CoreJava;

public class EncapsulationConcept {
 //Encapsulation is also called as Data hiding. To provide high level security we use encapsulation.

    /*How to implement encapsulation
  1. private data variables so that these cannot be accessed directly from outside the class. In order to access these public getters and setter methods are needed.*/
    private int ssn;
    private String empName;
    private int empAge;
    //data ariables would be hidden to other classes. In order to update a field we need set() and to read that particular variable we need get())


    public static void main(String[] args) {

        EncapsulationConcept emp =new EncapsulationConcept();

        emp.setSsn(123456);
        emp.setEmpName("Hemanth Venugopal");
        emp.setEmpAge(30);

        System.out.println("Employee name is " +emp.getempName());
        System.out.println("ssn is " +emp.getEmpAge());
        System.out.println("age is " +emp.getSsn());

    }

//Public getter and setter methods to set and get the values of the fields
    public int getSsn(){
        return ssn;
    }

    public void setSsn(int ssn){
        this.ssn = ssn;
    }

    public String getempName(){
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }


}
