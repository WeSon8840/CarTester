/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author Gloria Song
 */
public class Car {
        //variables for characteristics

    private String Carmake, Carmodel, colour, dealor;
    private int year, price;

    //constructors
    public Car() {
        Carmake = "Benz";
        Carmodel = "Unknow";
        colour = "Black";
        dealor = "Unknow";
        year = 2018;
        price = 100000;
  }

    public Car(String make, String model, String col, String dea, int caryear, int carprice) {
        Carmake = make;
        Carmodel = model;
        colour = col;
        dealor = dea;
        year = caryear;
        price = carprice;
  }

        //Alternate constructor
    public Car(String make, String model, String col, String dea) {
        //This constructor only uses the name and breed
        //Set the year and price to random #s

        Carmake = make;
        Carmodel = model;
        colour = col;
        dealor = dea;
        year = (int) (Math.random() * 8) + 2010;
        price = (int) (Math.random() * 10000) + 90000;
  }

    public void honkhorn() {
        System.out.println("bee! bee!");
  }
    
    //method to display all info of the Car
    public String toString() {
        String output = "Make: " + Carmake + "\n";
        output += "Model: " + Carmodel + "\n";
        output += "Colour: " + colour + "\n";
        output += "Dealor: " + dealor + "\n";
        output += "Year: " + year + "\n";
        output += "Price: " + price;
        //output string is complete, return it
        return output;
}
}
