package CodingChallange;

import org.apache.commons.lang.ObjectUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        try {
            m1();
//            m2();

        }catch (IndexOutOfBoundsException ex) {
            System.out.println("1");
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("2");
        } catch (Exception ec) {
            System.out.println("3");
        }
        finally {
            System.out.println("4");
        }
        System.out.println("end");

    }

    static void m1() {
        System.out.println("m1 Starts");
        throw new IndexOutOfBoundsException("bigg ban");
    }

    static void m2() {
        System.out.println("m1 Starts");
        throw new NullPointerException("nullp");
    }

    static void jump() throws IOException {
        throw new FileNotFoundException();
    }
}
