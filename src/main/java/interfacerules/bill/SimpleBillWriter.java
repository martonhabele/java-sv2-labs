package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String items : billItems) {
            String temp[] = items.split(";");
            int piece = Integer.parseInt(temp[2]);
            int price = Integer.parseInt(temp[1]);
            stringBuilder.append(String.format("%s, %d * %d = %d Ft", temp[0], piece, price, (piece * price))).append("\n");
        }
        return stringBuilder.toString();
    }
}