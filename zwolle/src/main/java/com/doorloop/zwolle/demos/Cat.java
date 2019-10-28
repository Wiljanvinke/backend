package com.doorloop.zwolle.demos;

import java.util.Comparator;

public class Cat implements Comparable<Cat>{
    private String name = "JD";
    private int length = 20;

    public Cat(){

    }

    public Cat(String name, int length){
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int compareTo(Cat o) {
        if(o.getLength() < length){
            return 1;
        }
        if(o.getLength() > length){
            return -1;
        }
        return 0;
    }
}
