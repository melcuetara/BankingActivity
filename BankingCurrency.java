//currency exchange amount taken as of 11/04/2022 8:20PM
public class BankingCurrency {
    
    
    public float toPhp(float funds, String currency) {

        if (currency.equals("USD")) {
            return funds *= 52.07;
        } else if (currency.equals("JPY")) {
            return funds *= 0.41;
        } else {
            return -1;  //if currency not found!
        }
    }

    public float toUsd(float funds, String currency) {

        if (currency.equals("PHP")) {
            return funds *= 0.019;
        } else if (currency.equals("JPY")) { 
            return funds *= 0.008;
        } else {
            return -1; //if currency not found!
        }
    }

    public float toJpy(float funds, String currency) {

        if (currency.equals("PHP")) {
            return funds *= 2.41;
        } else if (currency.equals("USD")) { 
            return funds *= 125.72;
        } else {
            return -1; //if currency not found!
        }
    }
}
