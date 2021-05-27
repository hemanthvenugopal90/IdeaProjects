package CoreJava.AbstractionAndInterfaceConcept;

public class ICICIBank extends Finance implements USBank, RBI {

    @Override
    public void educationLoan() {
        System.out.println("icici - edu loan");

    }

    @Override
    public void homeLoan() {
        System.out.println("icici- home loan");

    }

    @Override
    public void carLoan() {
        System.out.println("icici - car loan");

    }

    @Override
    public void debit() {
        System.out.println("icici - debit");

    }

    @Override
    public void credit() {
        System.out.println("icici - credit");

    }

    @Override
    public void transferMoney() {
        System.out.println("icici - transfermoney");

    }

    @Override
    public void trading() {
        System.out.println("icici - trading");
    }

    //ICICI bank class methods - these are not overridden methods
    public void mutualFunds(){
        System.out.println("icici - mutual funds");
    }

    public void insurance(){
        System.out.println("icici - insurance");
    }
}
