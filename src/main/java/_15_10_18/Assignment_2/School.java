package _15_10_18.Assignment_2;

public class School extends Building {

    private String name;
    private int numFloors;

    public School() {

    }

    public School(String name, int numFloors) {
        setName(name);
        setNumFloors(numFloors);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", numFloors=" + numFloors +
                '}';
    }

    public static School getSchool() {
        return new School();
    }
}
