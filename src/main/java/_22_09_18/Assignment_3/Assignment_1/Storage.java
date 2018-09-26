package _22_09_18.Assignment_3.Assignment_1;

import java.util.Objects;

public class Storage {

    private String storageName;
    private Fruits fruits;

    public Storage() {

    }

    public Storage(String storageName, Fruits fruits) {
        setFruits(fruits);
        setStorageName(storageName);

    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public Fruits getFruits() {
        return fruits;
    }

    public void setFruits(Fruits fruits) {
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
        if (this == o) return true;
        if (!(o instanceof Storage)) return false;
        Storage storage = (Storage) o;
        return Objects.equals(storageName, storage.storageName) &&
                Objects.equals(fruits, storage.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageName, fruits);
    }
}
