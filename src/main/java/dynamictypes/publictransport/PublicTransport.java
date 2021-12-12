package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {
    private List<PublicVehicle> vehicles = new ArrayList<>();

    public void addVehicle(PublicVehicle publicVehicle) {
        vehicles.add(publicVehicle);
    }

    public List<PublicVehicle> getVehicles() {
        return vehicles;
    }
}