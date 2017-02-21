package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> numbers = new ArrayList<>();
        Integer tries = 0;

        System.out.println("Enter a number: ");
        Scanner konzol = new Scanner(System.in);

        do {
            Integer num = konzol.nextInt();
            if (!numbers.contains(num)) {
                numbers.add(num);
                tries++;
            } else {
                tries = 0;
                System.out.println("Duplicate");
            }
        } while (!tries.equals(3));

        functions.arr_toString(numbers);
        System.out.println("Average of elements: " + functions.calculateAverage(numbers));

    }
}
