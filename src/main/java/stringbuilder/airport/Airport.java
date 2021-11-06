package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public static void main(String[] args) {
        Airport airport = new Airport();
        Flight testFlight1 = new Flight("P-47", Status.ACTIVE);
        airport.addFlight(testFlight1);
        Flight testFlight2 = new Flight("Po-8", Status.DELETED);
        airport.addFlight(testFlight2);

        System.out.println(airport.getDeletedFlights());
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder stringBuilder = new StringBuilder("Flights cancelled: ");
        for (Flight flight: flights) {
            if (flight.getStatus() == Status.DELETED) {
                stringBuilder.append(flight.getFlightNumber());
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}