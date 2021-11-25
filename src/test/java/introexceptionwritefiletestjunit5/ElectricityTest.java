package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {
    Electricity electricity = new Electricity();

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteStreets() throws IOException {
        Path path = temporaryFolder.toPath().resolve("addresses.txt");
        electricity.writeStreets(path);
        List<String> expectedEntries = Files.readAllLines(path);

        assertEquals(5, expectedEntries.size());
        assertEquals("Újbuda-központ", expectedEntries.get(3));
    }
}