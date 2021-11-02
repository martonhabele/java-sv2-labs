package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Budapest", "1010", "Várfok utca", 5);
        RealEstate realEstate = new RealEstate("Kényelmes", 100_000_000d, new Details("Szép", address, 100, 0));

        System.out.println(realEstate.getDetails().getAddress().toString());
        realEstate.getDetails().setDescription("Még szebb");
        System.out.println(realEstate.getDetails().getDescription());
        realEstate.setPrice(95_000_000d);
        System.out.println(realEstate.getPrice());
    }
}