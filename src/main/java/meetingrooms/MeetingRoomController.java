package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    Office office = new Office();
    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }

    public void readOffice() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Meeting room's name: ");
        String mName = scanner.nextLine();
        System.out.print("Meeting room's length: ");
        int mLength = scanner.nextInt();
        System.out.print("Meeting room's width: ");
        int mWidth = scanner.nextInt();
        office.addMeetingRoom(new MeetingRoom(mName, mLength, mWidth));
        runMenu();
    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int selectedMenu = scanner.nextInt();
        scanner.nextLine();

        switch (selectedMenu) {
            case 1:
                readOffice();
                break;

            case 2:
                office.printNames();
                runMenu();

            case 3:
                office.printNamesReverse();
                runMenu();

            case 4:
                office.printEvenNames();
                runMenu();

            case 5:
                office.printAreas();
                runMenu();

            case 6:
                System.out.print("Keresett tárgyaló neve: ");
                office.printMeetingRoomsWithName(scanner.nextLine());
                runMenu();

            case 7:
                System.out.print("Keresett tárgyaló névtöredék alapján: ");
                office.printMeetingRoomsContains(scanner.nextLine());
                runMenu();

            case 8:
                System.out.print("Keresett tárgyaló legkisebb mérete: ");
                office.printAreasLargerThan(scanner.nextInt());
                runMenu();

            case 9:
                System.exit(0);

            default:
                System.out.println("Nincs ilyen menüpont!\n");
                runMenu();
        }
    }
}