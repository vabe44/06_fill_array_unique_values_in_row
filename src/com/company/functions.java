package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by GTX on 20/02/2017.
 */
public class functions {

    public static double calculateAverage(ArrayList<Integer> marks) {
        Integer sum = 0;
        if(!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }

    public static void arr_toString(ArrayList<Integer> list) {
        System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

}
