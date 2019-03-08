package data_structures.Map;

import java.util.HashMap;
import java.util.Map;

class HashMapBook {
    int id;
    String name, author, publisher;
    int quantity;

    public HashMapBook(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name: " + "\"" + this.name + "\"," + " publisher: " + "\"" + this.publisher + "\"";
    }
}

class MapExample {
    public static void main(String[] args) {
        //Creating Map of Books

        Map<Integer, HashMapBook> map = new HashMap<>();

        //Creating Books

        HashMapBook b1 = new HashMapBook(101, "Let us C", "YE", "UR", 8);
        HashMapBook b2 = new HashMapBook(102, "Do Bfd", "EOEO", "EEF", 4);
        HashMapBook b3 = new HashMapBook(103, "KIm dfdf", "JEOE", "FKD", 6);


        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        //Traversing map

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue().toString());
        }
    }
}
