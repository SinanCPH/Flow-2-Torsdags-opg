package Task_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(5, 8, 8);
        Room room2 = new Room(7, 8, 10);
        Room room3 = new Room(20, 8, 28);

        ArrayList<Room> buildingRooms = new ArrayList<Room>();
        buildingRooms.add(room1);
        buildingRooms.add(room2);
        buildingRooms.add(room3);

        Building bygning = new Building(buildingRooms, 4, 6, true);
        System.out.println(countLampsInBuilding(bygning));
        System.out.println(isNormal(bygning));
    }

    public static int countLampsInBuilding(Building build) {
        int total = 0;
        for (Room room : build.getRooms()){
            int lamps = room.getNumberOfLamps();
            total+=lamps;
        }
        return total;
    }

    public static boolean isNormal(Building build){
        if(build.getNumberOfFloors() > build.getRooms().size()){
            return true;
        }
        else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}
