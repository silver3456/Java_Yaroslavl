package _12082018;

public class Wolf {
    private String name;
    private WolfSex sex;

    public Wolf(String name, WolfSex sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Wolf's name is '" + name + ", sex is " + sex;
    }

    public WolfSex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}
