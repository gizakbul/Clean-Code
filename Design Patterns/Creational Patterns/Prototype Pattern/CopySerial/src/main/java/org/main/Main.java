package org.main;

import org.apache.commons.lang3.SerializationUtils;
import org.models.Foo;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo(42, "life");
        // use apache commons!
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo2.whatever = "xyz";

        System.out.println(foo);
        System.out.println(foo2);
    }
}