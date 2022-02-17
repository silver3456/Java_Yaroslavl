package OCA;

public class Linux extends OS {

    int ver;

    public Linux(String name, int ver) {
        super(name);
        this.ver = ver;
    }

    public static void main(String[] args) {
        Linux os = new Linux("Ubuntu", 16);
    }
}
