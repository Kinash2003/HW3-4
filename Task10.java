package com.company;

import java.util.*;

public class Task10 {

    public static void main(String[] args) {
        Set<Integer> states = new HashSet();
        states.add(1);
        states.add(2);
        states.add(3);

        Set<Integer> statesPeople = new HashSet();
        statesPeople.add(1);
        statesPeople.add(2);
        statesPeople.add(7);
        statesPeople.add(13);

        System.out.println(union(states, statesPeople));
        System.out.println(intersect(states, statesPeople));

        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Popenko", "Inna");
        personMap.put("Igorova", "Marta");
        personMap.put("Stepanenko", "Frank");
        personMap.put("Sidorov", "Orest");
        personMap.put("Petrenko", "Petro");
        personMap.put("Hrytsenko", "Igor");
        personMap.put("Stiles", "Orest");
        personMap.put("Getty", "Igor");
        personMap.put("Bernadette", "Nicolas");
        personMap.put("Wienke", "Brody");

        for (Map.Entry<String, String> item : personMap.entrySet()) {
            System.out.printf("Last name: %s  First name: %s \n", item.getKey(), item.getValue());
        }

        boolean is = false;
        Map<String, String> personIs = new HashMap<String, String>();

        for (Map.Entry<String, String> item : personMap.entrySet()) {
            for (Map.Entry<String, String> item2 : personMap.entrySet()) {
                if (item.getValue().equals(item2.getValue()) && !(item.getKey().equals(item2.getKey()))) {
                    personIs.put(item.getKey(), item.getValue());
                    personIs.put(item2.getKey(), item2.getValue());
                    is = true;
                }
            }
        }

        if (is) {
            System.out.println();
            System.out.println("People with the same first name:");
            for (Map.Entry<String, String> item : personIs.entrySet()) {
                System.out.printf("Last name: %s  First name: %s \n", item.getKey(), item.getValue());
            }
        } else {
            System.out.println();
            System.out.println("No people with the same first name.");
        }
        while (personMap.containsValue("Orest")) {
            for (Map.Entry<String, String> item : personMap.entrySet()) {
                if (item.getValue().equals("Orest")) {
                    personMap.remove(item.getKey());
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("Without Orest");
        for (Map.Entry<String, String> item : personMap.entrySet()) {
            System.out.printf("Last name: %s  First name: %s \n", item.getKey(), item.getValue());
        }

    }

    public static Set union(Set set1, Set set2) {
        Set<Object> union = new HashSet();

        for (Object temp : set1) {
            union.add(temp);
        }
        for (Object temp : set2) {
            union.add(temp);
        }

        return union;
    }


    public static Set intersect(Set set1, Set set2) {
        Set<Object> intersect = new HashSet();

        for (Object temp : set1) {
            boolean is = set2.contains(temp);
            if (is) {
                intersect.add(temp);
            }
        }

        return intersect;
    }
}