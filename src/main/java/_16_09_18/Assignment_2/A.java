package _16_09_18.Assignment_2;

import java.util.Objects;

public class A {
    private int a;
    private int b;

    public A() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    @Override
    public int hashCode() {
        return a + b;
    }
    

    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new A();
        o1.setA(1);
        o1.setB(2);

        o2.setA(1);
        o2.setB(2);
       // System.out.println(o1.hashCode() == o2.hashCode());

        o2.setA(2);
        o2.setA(1);

        /*
         * Зесь мы иммем 2 объекта которые имеют разные значение,
         * то есть и объекты являются разными. Ожидаем false
         * Получаем коллизию, хэш код одинаковый
         * */
        System.out.println(o1.equals(o2));

        /*
         * Объект имеет всегда один хэш-код. Равен сам себе
         * */
       // System.out.println(o1.hashCode() == o1.hashCode());
    }
}
