package enumabstract;

public enum Discount {
    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return price * pieces * 0.8d;
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces < 3) {
                return price * pieces * 0.75d;
            } else {
                return price * (pieces - 1) * 0.75d + price * 0.5d;
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}