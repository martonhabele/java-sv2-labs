package optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BucketListTest {
    BucketList bucketList;

    @BeforeEach
    void init() {
        bucketList = new BucketList();
        bucketList.addDestination(new Destination("Oslo", "nice place", 2400));
        bucketList.addDestination(new Destination("Tirol", "lovely place", 720));
        bucketList.addDestination(new Destination("Island", "adorable place", 2900));
        bucketList.addDestination(new Destination("Wien", "cute place", 250));
    }

    @Test
    void testKeywordSearch() {
        assertEquals("Island", bucketList.getDestinationWithKeyword("ado").get().getName());
    }

    @Test
    void testWithoutValidKeyword() {
        assertEquals(Optional.empty(), bucketList.getDestinationWithKeyword("Xy"));
    }

    @Test
    void testDestinationNearer() {
        assertEquals("Wien", bucketList.getDestinationNearerThanGiven(500).get().getName());
    }

    @Test
    void testNoDestinationNearer() {
        assertEquals(Optional.empty(), bucketList.getDestinationNearerThanGiven(10));
    }
}