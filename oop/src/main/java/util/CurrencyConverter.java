package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double amountToBePaid(double dollarPrice, double dollarAmount) {
            double grossAmount = dollarPrice * dollarAmount;
            double iofAmount = grossAmount * IOF;
            return grossAmount + iofAmount;
    }
}
