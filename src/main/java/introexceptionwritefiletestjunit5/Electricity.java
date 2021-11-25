package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    public List<String> addressList () {
        List<String> addresses = new ArrayList<>();
        addresses.add(LocalDate.now().toString());
        addresses.add("Kosztolányi Dezső tér");
        addresses.add("Irinyi utca");
        addresses.add("Újbuda-központ");
        addresses.add("Rákóczi út");
        return addresses;
    }

    public void writeStreets(Path path) {
        List<String> addressList = addressList();
        try {
            Files.write(path, addressList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Fájl nem írható!", ioe);
        }
    }
}