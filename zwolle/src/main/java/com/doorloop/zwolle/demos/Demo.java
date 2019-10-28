package com.doorloop.zwolle.demos;

import com.doorloop.zwolle.model.Ober;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    //Comparator<>;
    //Comparable<>;
    //Collections.sort();

    public static void main(String[] args){
        List<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Marco Polo", 23));
        catList.add(new Cat("Minoes", 20));
        catList.add(new Cat("Snoet", 25));
        catList.add(new Cat("Mini", 10));
        catList.add(new Cat("Arcturus", 48));
        switch (catList.get(0).compareTo(catList.get(1))) {
            case 1: System.out.println(catList.get(0).getName() + " is groter dan " + catList.get(1).getName());
                break;
            case 0: System.out.println(catList.get(0).getName() + " is gelijk aan " + catList.get(1).getName());
                break;
            case -1: System.out.println(catList.get(0).getName() + " is kleiner dan " + catList.get(1).getName());
                break;
        }

        Collections.sort(catList, new CatSorter());
        //print lijst
        for(Cat cat : catList) {
            System.out.println(cat.getName() + " is " + cat.getLength() + " cm");
        }
    }
}
