package OCA;

abstract public class Alpha {

    protected void run() {
        System.out.println("run in alpha");
    }


    public static void main(String[] args) {


        Alpha obj = new Beta();
        obj.run();
    }
}
