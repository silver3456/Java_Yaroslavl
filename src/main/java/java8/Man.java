package java8;

public class Man {

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Man setName(String name) {
        this.name = name;
        return this;
    }

    public Man setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Man setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return "Man: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'';
    }
}
