package estaticos;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar price?: ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars?: ");
        double dollars = sc.nextDouble();

        double amountInReais = CurrencyConverter.amountToBePaid(dollarPrice, dollars);

        System.out.println("Amount in reais: " + amountInReais);

        sc.close();
    }
}
