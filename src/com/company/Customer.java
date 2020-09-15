package com.company;

public class Customer {

    public int custID;
    public String name;
    public String levelOfSkiing;

    public Customer(int custID, String name, String levelOfSkiing) {
        this.custID = custID;
        this.name = name;
        this.levelOfSkiing = levelOfSkiing;
    }

    public String toString(){ return "Customer ID: " + custID + ", Name: " + name + " Level of Skiing: " + levelOfSkiing;}

}
