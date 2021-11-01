package com.company;

public class Kettle {
    private boolean empty; //
    private boolean connected_electricity; //
    private boolean boiled = false;
    private double water = 3; //max limit of water

    public double getLimit(){
        return water;
    }

    public Kettle(boolean empty, boolean connected_electricity, double water){
        this.empty = empty;
        this.connected_electricity = connected_electricity;
        this.water = water;
    }
    public void kettleTest(){
        if (empty == true && connected_electricity == false){
            System.out.println("Your kettle is empty or isn`t connected");
        }else  {
            System.out.println("Kettle is ready");
            System.out.println("Level of water - "+water);
            boil();
        }
    }
    public void boil(){
        System.out.println( );
        System.out.println("Let`s try to bild water");
        System.out.println();
        if (water >= 3){
            System.out.println("The kettle is overfilled. Pour off some water");
        } else {
            boiled = true;
            System.out.println("Water is boiled");
        }
    }
    public String toString(){
        return "Kettle: empty - "+empty+",  Connected to electricity - "+connected_electricity+", level of water -"+water+ "boiled -"+boiled;
    }

}