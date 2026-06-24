package Group_Project;

public abstract class Appliance {
    private String applianceID, brand;
    private double powerRating, dailyHoursUsage;
    private Room room; // Composite
    private EnergyLabel label; // Aggregate

    public Appliance(){
        applianceID = null;
        brand = null;
        powerRating = 0.0;
        dailyHoursUsage = 0.0;
        room = new Room(); // Composite
        label = new EnergyLabel(); // Aggregate
    }

    public Appliance(String applianceID, String brand, double powerRating, double dailyHoursUsage, String roomName, int floorlevel, double roomArea) {
        this.applianceID = applianceID;
        this.brand = brand;
        this.powerRating = powerRating;
        this.dailyHoursUsage = dailyHoursUsage;
        this.room = new Room(roomName, floorlevel, roomArea);
        this.label = new EnergyLabel(); // Aggregate
    }

    public String getApplianceID() {
        return applianceID;
    }

    public void setApplianceID(String applianceID) {
        this.applianceID = applianceID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

}
