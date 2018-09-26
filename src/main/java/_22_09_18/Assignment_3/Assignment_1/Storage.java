package _22_09_18.Assignment_3.Assignment_1;

import java.util.Objects;

public class Storage {

    private String storageName;

    public Storage() {

    }

    public Storage(String storageName) {
        setStorageName(storageName);

    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageName='" + storageName + '\'' +
                '}';
    }
}

