package _15_10_18.Assignment_2;

public class School extends Building {
    //singleton
    private final static School singletonSchool = new School();

    private School() {
        super();
    }

    private School(String name, String buildingType, int floors) {
        super(name, buildingType, floors);
    }


    @Override
    public String toString() {
        return "School{" +
                "name='" + getName() + '\'' +
                ", numFloors=" + getFloors() +
                '}';
    }

    public static School getSingletonSchool(){
        return singletonSchool;
    }


    public static School getSchool() {
        return new School();
    }

    public static School getSchool(String name, Integer floors) {
        return new School(name, null, floors);
    }
}
