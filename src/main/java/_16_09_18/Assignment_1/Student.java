package _16_09_18.Assignment_1;

import java.util.Objects;

public class Student {

    private String name;
    private String age;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(this.getName(), student.getName()) &&
                Objects.equals(this.getAge(), student.getAge()) &&
                Objects.equals(this.getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
