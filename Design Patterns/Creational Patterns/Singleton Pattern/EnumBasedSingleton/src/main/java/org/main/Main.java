package org.main;

import org.models.EnumBasedSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    static void saveToFile(EnumBasedSingleton singleton, String filename)
            throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static EnumBasedSingleton readFromFile(String filename)
            throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (EnumBasedSingleton) in.readObject();
        }
    }

    //
    public static void main(String[] args)
            throws Exception {
        String filename = "myfile.bin";

        // run again with next 3 lines commented out

//    EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
//    singleton.setValue(111);
//    saveToFile(singleton, filename);

        EnumBasedSingleton singleton2 = readFromFile(filename);
        System.out.println(singleton2.getValue());
    }
}