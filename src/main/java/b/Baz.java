package b;
//import a.*;

import a.Foo;

public class Baz extends Foo {

    public static void main(String[] args) {

        Foo f = new Baz();
        Baz b = new Baz();

        System.out.println(f.c);
        System.out.println(b.b);
        System.out.println();
    }
}
