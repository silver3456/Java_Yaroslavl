package _21_10_18;

import org.junit.Ignore;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotations {

    @Test(timeout = 5000, expected = NullPointerException.class)
    public void test() {
        Method[] methods = this.getClass().getMethods();
        for (Method m : methods) {
            System.out.println("METHOD NAME:" + m.getName());

            Annotation[] annotations = m.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Test)
                    System.out.println("\tANNOTATION:" + annotation.annotationType());
            }
        }
        throw new NullPointerException();
        //throw new IllegalArgumentException();
    }

    @Test
    @Ignore("dfgdf")
    public void ignoreTest(){
        System.out.println("Ignore");
    }
}
