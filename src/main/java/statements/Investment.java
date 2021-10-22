package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.cost = 0.003;
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public double getYield(int days) {
        return (getFund() * (interestRate / 100d)) * (days / 365d);    //this also works for longer-than-a-year investments
    }

    public double close(int days) {
        double withdrawnAmount = getFund() + getYield(days);
        withdrawnAmount *= (1 - cost);                                //calculating the already-commissioned part
        double payout = active ? withdrawnAmount : 0;
        active = false;
        return payout;
    }

    public int getFund() {
        return fund;
    }

    public int getInterestRate() {
        return interestRate;
    }
}