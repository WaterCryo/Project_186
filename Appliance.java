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

    public Appliance(String applianceID, String brand, double powerRating, double dailyHoursUsage, String roomName, int floorlevel, double roomArea, EnergyLabel label) {
        this.applianceID = applianceID;
        this.brand = brand;
        this.powerRating = powerRating;
        this.dailyHoursUsage = dailyHoursUsage;
        room = new Room(roomName, floorlevel, roomArea); // Composite
        this.label = label;
    }

    public void setAppliance(String applianceID, String brand, double powerRating, double dailyHoursUsage, String roomName, int floorlevel, double roomArea, EnergyLabel label) {
        this.applianceID = applianceID;
        this.brand = brand;
        this.powerRating = powerRating;
        this.dailyHoursUsage = dailyHoursUsage;
        room = new Room(roomName, floorlevel, roomArea); // Composite
        this.label = label; // Aggregation
    }
    public void setApplianceID(String applianceID){
        this.applianceID = applianceID;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPowerRating(double powerRating){
        this.powerRating = powerRating;
    }
    public void setDailyHoursUsage(double dailyHoursUsage){
        this.dailyHoursUsage = dailyHoursUsage;
    }
    public void setRoom(String name, int level, double area){
        room.setRoom(name, level, area);
    }
    public void setLabel(EnergyLabel label){
        this.label = label;
    }

    public String getApplianceID(){ return applianceID;}
    public String getBrand(){ return brand;}
    public double getPowerRating(){ return powerRating;}
    public double getDailyHoursUsage(){ return dailyHoursUsage;}
    public String getName_Room(){ return room.getRoomName();}
    public int getLevel_Room(){ return room.getFloorLevel();}
    public double getArea_Room(){ return room.getRoomArea();}
    public EnergyLabel getLabel(){ return label;}

    @Override
    public String toString(){
        return "Appliance{" +
                "applianceID='" + applianceID + '\'' +
                ", brand='" + brand + '\'' +
                ", powerRating=" + powerRating +
                ", dailyHoursUsage=" + dailyHoursUsage +
                room.toString() + 
                ", label=" + label +
                '}';
    }
}
