package com.doorloop.zwolle.demos;

import java.util.Comparator;

public class CatSorter implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getLength() - o2.getLength();
    }
}
