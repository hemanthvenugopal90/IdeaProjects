package CoreJava.InterfaceAndMultipleInheritance;

public interface USBank {

    int min_bal = 100; //by default variable in an interface will be STATIC by nature and also FINAL by nature and once defined can't be changed

    public void credit();

    public void debit();

    public void transferMoney();
}

//Interview Question - What is an Interface??
// Only Method declaration
//no method body only method prototype
//In interface we can declare variables, varibles are by default static in nature
// vars value will not be changed, its Final/constant in nature
// no static method in interface
// no main method in interface
// We cannot create an object of an interface
// interface is abstract in nature

