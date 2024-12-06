package org.main;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BasicSingleton implements Serializable {
    // cannot new this class, however
    // * instance can be created deliberately (reflection)
    // * instance can be created accidentally (serialization)
    private BasicSingleton() {
        System.out.println("Singleton is initializing");
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    private int value = 0;

    // required for correct serialization
    // readResolve is used for _replacing_ the object read from the stream

//  protected Object readResolve()
//  {
//    return INSTANCE;
//  }

    // generated getter
    public static BasicSingleton getInstance()
    {
        return INSTANCE;
    }
}
