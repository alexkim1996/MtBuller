package com.company;

public class Accommodation {

    public int accID;
    public String type;
    public double pricePerDay;
    public boolean availability;

    public Accommodation(int accID, String type, double pricePerDay, boolean availability) {
        this.accID = accID;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.availability = availability;

    }


    public int getAccID () {
        return accID;
    }

    public void setAccID(int accID){
        this.accID = accID;
    }

    public String toString () {
        return "Accommodation ID: " + accID + ", type: " + type  + ", price per day: " + pricePerDay + ", available?  " + availability;
    }
}
