package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {
    @Test
    void testPublicVehicles() {
        PublicVehicle bus = new Bus(153, 16.5, "MAN");
        PublicVehicle tram = new Tram(41, 24.4, 2);
        PublicVehicle metro = new Metro(2, 13.2, 11);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);
        assertEquals(153, publicTransport.getVehicles().get(0).getLineNumber());
        assertEquals(24.4, publicTransport.getVehicles().get(1).getLength());
        assertEquals(3, publicTransport.getVehicles().size());
    }
}