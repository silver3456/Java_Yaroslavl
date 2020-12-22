package prac;

public interface Inter {

    default void run(){
        System.out.println("run in Inter");
    }
}
