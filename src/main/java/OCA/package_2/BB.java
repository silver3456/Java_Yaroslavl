package OCA.package_2;


import java.io.FileNotFoundException;
import java.sql.SQLDataException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BB  {

    String name = "b";

    public static void run()  {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public float run(float b) {
        return 10;
    }

    public void walk() {
        System.out.println("walk in BB");
    }


    public static void main(String[] args) {

        BB obj = new BB();
        obj.walk();

        LocalDate ld = LocalDate.of(1995, 05, 13);
        System.out.println(ld);


        List<String> list = new ArrayList<>();
        list.add("fdfd");
        list.add(null);

        for (String e : list) {
            if (e.equals("fdfd"))
                list.add("bb");
        }


//        try {
//            run();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        AA b = new BB();
//        BB a = new BB();
//        System.out.println(((BB) b).name);
//        System.out.println(a.age);
//
//        for (;; )
//            System.out.println("hi");
    }
}
