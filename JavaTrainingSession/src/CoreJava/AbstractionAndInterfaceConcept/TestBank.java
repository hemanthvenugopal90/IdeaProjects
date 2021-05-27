package CoreJava.AbstractionAndInterfaceConcept;

public class TestBank {
    public static void main(String[] args) {
        //USBank us = new USBank(); - this is not possible as we cant create an object of an interface.

        ICICIBank ic = new ICICIBank();
        ic.educationLoan();
        ic.carLoan();
        ic.homeLoan();

        ic.credit();
        ic.debit();
        ic.transferMoney();
        ic.trading();

        ic.mutualFunds();
        ic.insurance();

        System.out.println(USBank.min_bal);

        USBank us =new ICICIBank(); //Child class object can be referrenced by Parent interface reference variable.
        us.credit();
        us.debit();
        us.trading();
        us.transferMoney();



    }


}
