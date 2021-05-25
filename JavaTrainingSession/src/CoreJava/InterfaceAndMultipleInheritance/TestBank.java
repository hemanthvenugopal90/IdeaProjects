package CoreJava.InterfaceAndMultipleInheritance;

public class TestBank {

    public static void main(String[] args) {

        //System.out.println(min_bal); - this is not allowed
        System.out.println(USBank.min_bal);
        //USBank.min_bal = 200; - This is not allowed
        HSBCBank hs=new HSBCBank();
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.carLoan();
        hs.EducationLoan();

        //Dynamic Polymorphism
        //Child class object can be created by parent interface reference variable
        USBank b = new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();

        //only overridden methods will be called

    }
}
