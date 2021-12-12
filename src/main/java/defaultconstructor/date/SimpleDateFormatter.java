package defaultconstructor.date;

public class SimpleDateFormatter {
    public static final String DASH = "-";
    private CountryCode defaultCountryCode;

    public SimpleDateFormatter() {
        this.defaultCountryCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(defaultCountryCode, simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        if (countryCode == CountryCode.HU) {
            return simpleDate.getYear() + DASH + simpleDate.getMonth() + DASH + simpleDate.getDay();
        }
        else if (countryCode == CountryCode.EN) {
            return simpleDate.getDay() + DASH + simpleDate.getMonth() + DASH + simpleDate.getYear();
        }
        else {
            return simpleDate.getMonth() + DASH + simpleDate.getDay() + DASH + simpleDate.getYear();
        }
    }
}