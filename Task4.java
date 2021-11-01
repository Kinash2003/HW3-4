package com.company;

public class Task4 {
        public static void main(String[] args) {
            Person a1 = new Person("Roman", 2003);
            Person a2 = new Person("Oleh", 1998);
            Person a3 = new Person("Vasyl", 2017);
            Person a4 = new Person("Paul", 2005);
            Person a5 = Person.input();

            System.out.println("People!");
            Person[] people = new Person[]{a1, a2, a3, a4, a5};
            for (Person x : people)
            {
                x.output();
            }

        }
    }


