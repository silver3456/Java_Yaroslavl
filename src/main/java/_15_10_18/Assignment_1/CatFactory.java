package _15_10_18.Assignment_1;

public class CatFactory {
    public static Cats getCatByKey(String key) {

        Cats cat = null;

        if (key.length() > 7) {
            cat = new MaleCat("Male cat is created: " + key);
        } else if (key.length() >= 4 && key.length() <= 6) {
            cat = new FemaleCat("Female cat is created: " + key);
        } else {
            cat = new Cats("Cat with ? sex is created: " + key);
        }

        return cat;
    }
}

