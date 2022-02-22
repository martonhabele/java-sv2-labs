package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {
    private List<Destination> destinations = new ArrayList<>();

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        for (Destination d : destinations) {
            if (d.getDescription().contains(keyword)) {
                return optional.of(d);
            }
        }
        return optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        for (Destination d : destinations) {
            if (d.getKmFromHome() < maxKm) {
                return optional.of(d);
            }
        }
        return optional.empty();
    }

    public List<Destination> getDestinations() {
        return new ArrayList<>(destinations);
    }
}