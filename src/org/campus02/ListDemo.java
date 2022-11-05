package org.campus02;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        integers.add(1);
        integers.add(3);
        System.out.println(integers.size()); //Ausgabe der Größe

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hallo");
        System.out.println(strings.size());

        boolean contains = integers.contains(3);
        System.out.println("contains = " + contains);

        integers.add(1, 10);
        System.out.println(integers.size());

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("Zahl = " + integers.get(1));

        }

        integers.add(0, 20); //füge an der ersten Stelle 20 ein
        for (int number : integers) {
            System.out.println("number = " + number);

        }


    }
}
