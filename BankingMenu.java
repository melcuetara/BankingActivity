public class BankingMenu {
    

    public void printBankingMenu() {

        System.out.println(System.lineSeparator());
        System.out.println("1. Display Information.");
        System.out.println("2. Add Funds. ");
        System.out.println("3. Withdraw Funds. ");
        System.out.println("4. Convert Funds. ");
        System.out.println("0. Exit Program ");
    }

    public void displayUserInformation(String name, float funds, String currency) {

        System.out.println(System.lineSeparator());
        System.out.println("Name: " + name);
        System.out.println("Funds: " + funds + currency);
    }

    public void printCurrenyMenu() {

        System.out.println(System.lineSeparator());
        System.out.println("1. PHP - Philippine Peso");
        System.out.println("2. USD - United States Dollar");
        System.out.println("3. JPY - Japanese Yen");
    }
}
