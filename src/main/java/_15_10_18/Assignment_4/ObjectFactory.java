package _15_10_18.Assignment_4;

public class ObjectFactory {
    public ObjectFactory(){

    }

    public Person createObjectByKey(String key){
        switch (key){
            case "looser":
                return new Looser();
            case "user":
                return new User();
            case "coder":
                return new Coder();
            case "proger":
                return new Proger();
        }
        return null;
    }
}
