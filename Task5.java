package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public enum MyEnum {
        Multiple_Choices(300 ),
        Moved_Permanently(301 ),
        Found(302),
        See_Other(303),
        Not_Modified(304),
        Use_Proxy(305),
        Temporary_Redirect(307),
        Permanent_Redirect(308);

        private int id;
        private MyEnum(int id) {
            this.id = id;
        }
        private int getId() {
            return id;
        }

        public static MyEnum fromId(int id) {
            for (MyEnum type : values()) {
                if (type.getId() == id) {
                    return type;
                }
            }
            return null;
        }
    }



    public static void task5_1_1_InRange(Scanner scan)
    {
        int size =3;
        float[] arrayFloat = new float[3];

        System.out.println("Please, input three float number.");
        for(int i=0; i<size; i++) {
            arrayFloat[i]=scan.nextFloat();
        }

        int countInRange=0;
        for(int i=0; i<size; i++) {
            if (-5 <= arrayFloat[i]  && arrayFloat[i]  <= 5)  countInRange++;
        }

        if(countInRange==size) {
            System.out.println("All numbers is in range!");
        }
        else System.out.println("Not all numbers is in range!");
    }
    public static void task5_1_2_MaxMinNumber(Scanner scan) {
        int size =3;
        int[] arrayInt = new int[size];

        System.out.println("Please, input three int number.");
        for(int i=0; i<size; i++) {
            arrayInt[i]=scan.nextInt();
        }
        Arrays.sort(arrayInt);
        System.out.println("Minimum = " + arrayInt[0]);
        System.out.println("Maximum = " + arrayInt[arrayInt.length-1]);

    }

    public static void task5_1_3_HTTPSErrors(Scanner scan) {
        int inputCodeError;
        System.out.println("Please, input error`s code.");
        inputCodeError = scan.nextInt();

        MyEnum myEnum = MyEnum.fromId(inputCodeError);
        System.out.println("Title error is " + myEnum);
    }

    public static void task5_2Gog()
    {

        Dog d1 = new Dog("Max", 9,breedVariant.ROTTWEILERS);
        Dog d2  = new Dog("Bars", 3, breedVariant.POODLES);
        Dog d3  = new Dog("Muhtar", 11, breedVariant.ROTTWEILERS);

        if(d1.getName().equals(d2.getName()) ||  d1.getName().equals(d3.getName()) )
        {
            System.out.println("The same names exist.");
        }
        else  System.out.println("The same names don`t exist.");



        if(d1.getAge()>d2.getAge() && d1.getAge()>d3.getAge())
            System.out.println(d1);
        else if (d2.getAge()>d3.getAge() && d2.getAge()>d1.getAge())
            System.out.println(d2);
        else
            System.out.println(d3);





    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        task5_1_1_InRange(scan);
        task5_1_2_MaxMinNumber(scan);
        task5_1_3_HTTPSErrors(scan);
        task5_2Gog();





    }
}