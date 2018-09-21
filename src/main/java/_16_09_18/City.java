package _16_09_18;

public class City {
    private String name;
    private int citizens;

    public City(String name, int citizens) {

        setCitizens(citizens);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCitizens() {
        return citizens;
    }

    public void setCitizens(int citizens) {
        this.citizens = citizens;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", citizens=" + citizens +
                '}';
    }


}
