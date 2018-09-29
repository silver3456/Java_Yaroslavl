package _22_09_18.Assignment_3.Assignment_1;

import java.util.Objects;
import java.util.Set;

public class Storage {

    private String storageName;
    private Set<Fruits> fruits;

    public Storage() {

    }

    public Storage(String storageName, Set<Fruits> fruits) {
        setStorageName(storageName);
        setFruits(fruits);

    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public Set<Fruits> getFruits() {
        return fruits;
    }

    public void setFruits(Set<Fruits> fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageName='" + storageName + '\'' +
                ", fruits=" + fruits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if (this == o) return true;
        if (!(o instanceof Storage)) return false;
        Storage storage = (Storage) o;

        return storageName.equals(storage.storageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageName);
    }
}

