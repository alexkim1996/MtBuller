package com.company;

public class Customer {

    private int custID;
    static int nextID = 1;
    private String name;
    private String levelOfSkiing;

    public Customer(String name, String levelOfSkiing){
        this.name = name;
        this.levelOfSkiing = levelOfSkiing;
        custID = nextID++;
    }

    public int getCustID(){
        return custID;
    }
    public void setCustID(int custID){
        this.custID = custID;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public String getLevelOfSkiing(){
        return levelOfSkiing;
    }
    public void setLevelOfSkiing (String levelOfSkiing){
        this.levelOfSkiing = levelOfSkiing;
    }
    public String toString(){ return "Customer ID: " + custID + ", Name: " + name + " Level of Skiing: " + levelOfSkiing;}

}

// have to utilise getters and setters for input and retrieval