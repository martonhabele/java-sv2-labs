package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private static final List<Rate> RATES = new ArrayList<>();
    private long balance;

    public CreditCard(long balance, Currency currency, List<Rate> values) {
        RATES.addAll(values);
        this.balance = balance;
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public boolean payment(long amount, Currency currency) {
        long value = Math.round(amount * getConversionRate(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }

    private double getConversionRate(Currency currency) {
        for (Rate rate : RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConvFactor();
            }
        }
        return 1.0;
    }

    public long getBalance() {
        return balance;
    }
}