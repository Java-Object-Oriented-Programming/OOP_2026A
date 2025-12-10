package Week05;

import java.util.Objects;
import java.util.Random;

public class TruckMain {


    public static void main(String[] args) {
        Truck[] trucks = new Truck[10];
        Random rd = new Random();
        for (int i = 0; i < trucks.length; i++) {
            trucks[i] = new Truck("@" + Integer.toHexString(rd.nextInt()), "Driver-" + i, rd.nextInt(1, 13));
        }

        System.out.println("---------------------------------------------");
        for (int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i]);
        }
        System.out.println("---------------------------------------------");
        getIsFreeName(trucks);

        for (int i = 0; i < trucks.length; i++) {
            trucks[i].isFree = rd.nextBoolean();
        }


        System.out.println("---------------------------------------------");
        for (int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i]);
        }
        System.out.println("---------------------------------------------");
        getIsFreeName(trucks);

        System.out.println(getIdTruck(trucks));
    }

    public static void getIsFreeName(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++)
            if (trucks[i].numStorage >= 7 && trucks[i].isFree)
                System.out.println(trucks[i]);

    }

    public static String getIdTruck(Truck[] trucks) {
        int max = 0;
        Truck truck = null;

        for (int i = 0; i < trucks.length; i++)
            if (trucks[i].isFree && max < trucks[i].numStorage) {
                max = trucks[i].numStorage;
                truck = trucks[i];
            }


        if (truck == null) {
            return "out of service";
        } else {
            return truck.truckId;
        }

//        return truck == null ? "out of service" : truck.truckId;
    }
}
