package com.company;

import java.io.*;
/**
 *
 * @author e00475
 */


public class Accommodation implements Serializable{

    protected int accID;
    protected String type;
    protected int numberOfBeds;
    protected double pricePerDay;
    protected boolean isAvailable = true;
    static int nextID = 100;

    public Accommodation(){
        accID = nextID++;
    }
    public Accommodation(int numberOfBeds,String type, double pricePerDay){
        this.type = type;
        this.numberOfBeds = numberOfBeds;
        this.pricePerDay = pricePerDay;
        accID = nextID++;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public String getType(){
        return type;
    }
    public int getAccID(){
        return accID;
    }
    public double getPricePerDay(){
        return pricePerDay;
    }
    public int getNumberOfBeds(){
        return numberOfBeds;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public String toString(){
        return "ID: " + accID + ", type: " + type + ", no of beds "+ numberOfBeds
                + ",  price Per Day: " + pricePerDay;
    }
}
