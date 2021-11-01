package com.company;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //3.1

        System.out.println("Radius: ");
        double radius = scan.nextDouble();
        System.out.println("Perimeter is = " + 2 * radius * Math.PI);
        System.out.println("Area is = " + Math.PI * radius * radius);


        //3.2
        String name, address;
        System.out.println("What is your name ?");
        name = scan.nextLine();
        System.out.println("Where are you live, " + name + "?");
        address = scan.nextLine();
        System.out.println("Your name is " + name + ".\nYour address is "+ address + ".");


        //3.3
        int sizeCountry = 3;

        double[] arrayPrice = new double[sizeCountry];
        double[] arrayDuration = new double[sizeCountry];

        System.out.println("Please, input price for 1 minute in 1, 2, 3 countries (c1, c2, c3) !");
        for(int i=0; i<sizeCountry; i++) {
            arrayPrice[i]=scan.nextDouble();
        }
        System.out.println("Please, input call`s duration for 1, 2, 3 calls (t1, t2, t3) !");
        for(int i=0; i<sizeCountry; i++) {
            arrayDuration[i]=scan.nextDouble();
        }

        double sumGeneral = 0;

        for(int i=0;i<sizeCountry;i++) {
            System.out.println("Price for call " + i+1 + " is "+ arrayPrice[i]*arrayDuration[i] );
            sumGeneral = sumGeneral + (arrayPrice[i]*arrayDuration[i]);
        }

        System.out.println("General price is "+ sumGeneral);
    }
}