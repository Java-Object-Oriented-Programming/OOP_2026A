package Week05;

public class Truck {

    String truckId;
    String driverName;
    int numStorage;
    boolean isFree;

    public Truck(String truckId, String driverName, int numStorage) {
        this.truckId = truckId;
        this.driverName = driverName;
        this.numStorage = numStorage;
        this.isFree = true;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckId='" + truckId + '\'' +
                ", driverName='" + driverName + '\'' +
                ", numStorage=" + numStorage +
                ", isFree=" + isFree +
                '}';
    }
}
