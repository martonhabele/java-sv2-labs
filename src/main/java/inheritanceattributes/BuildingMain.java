package inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("Tower", 110, 72);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Small", 65, 3, 10);

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}