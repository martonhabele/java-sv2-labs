package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom mRooms: meetingRooms) {
            System.out.println(mRooms.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i > 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for (int i = 1; i < meetingRooms.size();i += 2 ) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for (MeetingRoom mRooms: meetingRooms) {
            System.out.print("Name: " + mRooms.getName());
            System.out.println("Dimensions: " + mRooms.getLength() + " x " + mRooms.getWidth());
            System.out.println("Area: " + mRooms.getArea());
        }
    }

    public void printMeetingRoomsWithName(String name) {
        Scanner scanner = new Scanner(name);
        scanner.hasNext()

    }
}