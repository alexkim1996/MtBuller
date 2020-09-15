package com.company;
import java.time.LocalDate;

public class TravelPackage {
    public int custID;
    public int duration;
    public LocalDate startDate;
    public Accommodation acco;

    public TravelPackage (int custID, int duration, LocalDate startDate){
        this.custID = custID;
        this.duration = duration;
        this.startDate = startDate;
    }

    public String toString(){
        return "Customer ID: " + custID + ", " +
                "Duration: " + duration + ", " +
                "Start date: " + startDate + ", " +
                "Accommodation: " + acco;}
}


