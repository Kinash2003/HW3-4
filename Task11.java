package com.company;


import java.util.ArrayList;
import java.util.List;

public class Task11 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        String[] name = new String[]{"Tom", "Bob", "Lili", "Fred", "Maria"};
        int[] course = new int[]{1, 2, 2, 5, 4};

        Student s;
        for (int i = 0; i < 5; ++i) {
            s = new Student(name[i], course[i]);
            students.add(s);
        }



        System.out.println();
        for (Object person : students) {
            System.out.println(person);
        }

        students.sort(new SortedByName());
        System.out.println("\n~~~ Сортування по імені");

        for (Student product : students)
            System.out.println(product.toString());

        students.sort(new SortedByCourse());
        System.out.println("\n~~~ Сортування по курсах");

        for (Student product : students)
            System.out.println(product.toString());
    }

}