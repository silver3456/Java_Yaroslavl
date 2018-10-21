package _15_10_18.Assignment_1;

public class CatFactory {
    public static Cat getCatByKey(String key) {

        Cat cat = null;

        if (key.length() > 5) {
            cat = new MaleCat();
        } else  {
            cat = new FemaleCat();
        }
        return cat;
    }
}

