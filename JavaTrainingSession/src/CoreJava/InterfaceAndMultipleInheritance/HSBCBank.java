package CoreJava.InterfaceAndMultipleInheritance;
//Achieving Multiple inheritance using interfaces. Inheriting from multiple parents USBank and Brazilbank
public class HSBCBank implements USBank,BrazilBank {
//This concept is called "Is-a Relationship which means Interface"
    // If a class is implementin any interface then its mandatory to Override/Define all the methods of interface.
    // Overriding from US bank
    public void credit(){
        System.out.println("HSBC --> Credit");
    }

    public void debit(){
        System.out.println("HSBC --> Debit");
    }

    public void transferMoney(){
        System.out.println("HSBC --> TransferMoney");
    }

    //Separate methods of HSBCBank class
    public void carLoan(){
        System.out.println("HSBC-->carloan");
    }

    public void EducationLoan(){
        System.out.println("HSBC-->Education loan");
    }

    //BrazilBank method
    public void mutualFund(){
        System.out.println("hsbc-->Mutual Fund");
    }
}
