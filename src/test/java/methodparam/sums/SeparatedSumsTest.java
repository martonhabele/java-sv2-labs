package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumsTest {
    @Test
    void testSum() {
        SeparatedSums separatedSums = new SeparatedSums();
        String floatingNums = separatedSums.readFromFile();
        Sums sums = separatedSums.sum(floatingNums);
        assertEquals(110.6, sums.getPositiveSums(), 0.1);
        assertEquals(-153.3, sums.getNegativeSums(), 0.1);
    }
}