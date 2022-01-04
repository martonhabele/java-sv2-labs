package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : billItems) {
            String temp[] = item.split(";");
            int piece = Integer.parseInt(temp[2]);
            int price = Integer.parseInt(temp[1]);
            stringBuilder.append(String.format("%s; darabszám: %d, egységár: %d, összesen: %d Ft", temp[0],
                    piece, price, (piece * price))).append("\n");
        }
        return stringBuilder.toString();
    }
}