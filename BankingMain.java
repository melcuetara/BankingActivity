import java.util.Scanner;

public class BankingMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        BankingMenu menu = new BankingMenu();
        BankingCurrency convert = new BankingCurrency();
        int selectMenu;
        float funds = 10000.00f;
        String name;
        String currency = "PHP";

        System.out.print("Enter your name: ");
        name = input.nextLine();
        do  {
            System.out.print(System.lineSeparator());
            menu.printBankingMenu();
            System.out.print("Select Menu: ");
            selectMenu = input.nextInt();
            switch (selectMenu) {
                case 1: menu.displayUserInformation(name, funds, currency); 
                        break;

                case 2: System.out.print("Enter Amount to be Deposited: ");
                        float deposit = input.nextFloat();
                        if (deposit < 500) {
                            System.out.println("Invalid Desposit Amount. Minimum Deposit should be atleast 500!");
                        } else {
                            funds += deposit;
                            System.out.println("Successfully Deposited: " + deposit + currency);
                        }
                        break;

                case 3: System.out.print("Enter Amount to be Withdrawn: ");
                        float withdrawn = input.nextFloat();
                        if (withdrawn < 500) {
                            System.out.println("Invalid Withdraw Amount. Minimum Withraw should be atleast 500!");
                        }
                        else if (funds < withdrawn) {
                            System.out.println("Insufficent Funds!");
                        } else {
                            funds -= withdrawn;
                            System.out.println("Successfully Withdrawn: " + withdrawn + currency);
                        }
                        break;

                case 4: menu.printCurrenyMenu();
                        System.out.print("Enter the currency to be converted into: ");
                        int selectCurrencyMenu = input.nextInt();
                        switch (selectCurrencyMenu) {
                            case 1: if (currency.equals("PHP")) {
                                        System.out.println("Currency is already in PHP!");
                                    } else {
                                    funds = convert.toPhp(funds, currency);
                                    currency = "PHP";
                                    }
                                    break;

                            case 2: if (currency.equals("USD")) {
                                         System.out.println("Currency is already in USD!");
                                    } else {
                                    funds = convert.toUsd(funds, currency);
                                    currency = "USD"; 
                                    }
                                    break;
                                    
                            case 3: if (currency.equals("JPY")) {
                                    System.out.println("Currency is already in JPY!");
                                    } else {
                                    funds = convert.toJpy(funds, currency);
                                    currency = "JPY"; 
                                    }
                                    break;
                        }
                        break;

                case 0: input.close();                
            }
        } while(selectMenu != 0); 
    }
}