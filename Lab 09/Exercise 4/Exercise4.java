package com.capgemini.lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
	
	public static int compareByName(Person p1, Person p2) { return p1.getName().compareTo(p2.getName()); }
    public static int compareByAge(Person p1, Person p2) { return p1.getAge().compareTo(p2.getAge()); }

    public static void main(String[] args) {
        List<Person> pList = new ArrayList<>();
        pList.add(new Person("Joysurjya", 21));
        pList.add(new Person("Sam", 14));
        pList.add(new Person("Bucky", 47));

        //	Sort by name static method reference
        Collections.sort(pList, Exercise4::compareByName);
        System.out.println("Sorted by name: ");
        pList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        //	Sort by age static method reference
        Collections.sort(pList, Exercise4::compareByAge);
        System.out.println("Sorted by age: ");
        pList.stream()
                .map(y -> y.getAge())
                .forEach(System.out::println);
    }
}
