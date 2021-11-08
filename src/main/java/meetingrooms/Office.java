package meetingrooms;

import java.util.ArrayList;
import java.util.List;

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
        for (int i = 1; i < meetingRooms.size(); i += 2 ) {
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
        for (MeetingRoom mRooms: meetingRooms) {
            if (mRooms.getName().equalsIgnoreCase(name)) {
                System.out.println("Name: " + mRooms.getName());
                System.out.println("Length: " + mRooms.getLength());
                System.out.println("Width: " + mRooms.getWidth());
                System.out.println("Area: " + mRooms.getArea());
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom mRooms: meetingRooms) {
            if (mRooms.getName().contains(part)) {
                System.out.println("Name: " + mRooms.getName());
                System.out.println("Length: " + mRooms.getLength());
                System.out.println("Width: " + mRooms.getWidth());
                System.out.println("Area: " + mRooms.getArea());
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom mRooms: meetingRooms) {
            if (mRooms.getArea() >= area) {
                System.out.println("Name: " + mRooms.getName());
                System.out.println("Length: " + mRooms.getLength());
                System.out.println("Width: " + mRooms.getWidth());
                System.out.println("Area: " + mRooms.getArea());
            }
        }
    }
}