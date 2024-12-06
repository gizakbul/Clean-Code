package org.example;

import org.impl.ManyValues;
import org.impl.MyList;
import org.impl.SingleValue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SingleValue singleValue = new SingleValue(10);
        ManyValues manyValues = new ManyValues();
        manyValues.add(20);
        manyValues.add(30);

        MyList myList = new MyList(Arrays.asList(singleValue, manyValues));
        System.out.println(myList.sum()); // 60
    }
}