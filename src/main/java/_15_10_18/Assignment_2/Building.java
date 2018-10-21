package _15_10_18.Assignment_2;

public class Building {

    private String name;
    private String buildingType;
    private int floors;

    public Building() {

    }

    public Building(String name, String buildingType, int floors) {
        setName(name);
        setBuildingType(buildingType);
        setFloors(floors);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", floors=" + floors +
                '}';
    }

    public static Building getBuilding() {
        return new Building();
    }

    public static Building getBuilding(String name, Integer floors) {
        return new Building(name, null, floors);
    }

}