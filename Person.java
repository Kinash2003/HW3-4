package com.company;

import java.time.Year;
import java.util.Scanner;

public class Person {
    static Scanner in = new Scanner(System.in);
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;}

    public int getBirthYear() {
        return birthYear;}

    public void setName(String name) {
        this.name = name;}

    public void setbirthYear(int birthYear) {
        this.birthYear = birthYear;}


    public int age ()
    {
        Year now = Year.now();
        return Integer.parseInt(now.toString()) - this.getBirthYear();
    }

    static Person input()
    {
        System.out.print( "Name:  ");
        String  name = in.next();
        System.out.print( "Year: ");
        int  year = in.nextInt();
        return new Person(name, year);
    }

    public void output()
    {
        System.out.println("Name : "+ this.getName()) ;
        System.out.println("BirthYear : "+ this.getBirthYear()) ;
        System.out.println("Age : "+ this.age()) ;
    }

    public void changeName(String n)
    {
        this.setName(n);
    }
}