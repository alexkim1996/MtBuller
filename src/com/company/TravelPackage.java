package com.company;
import java.time.LocalDate;

public class TravelPackage {
    public int custID;
    public int duration;
    public LocalDate startDate;
    public Accommodation acco;
    public double liftPass;
    public double lessonFees;

    public TravelPackage() {

    }

    public TravelPackage (int custID, int duration) {
        this.custID = custID;
        this.duration = duration;
    }
    public TravelPackage(int custID, int duration, LocalDate startDate){
        this(custID,duration);
        this.startDate = startDate;
    }
    public TravelPackage(int custID, int duration, LocalDate startDate, Accommodation acco){
        this(custID,duration,startDate);
        this.acco = acco;
    }

    public TravelPackage(int custID, int duration, LocalDate startDate, Accommodation acco, double liftPass){
        this(custID,duration,startDate,acco);
        this.liftPass = liftPass;
    }
    public TravelPackage(int custID, int duration, LocalDate startDate, Accommodation acco, double liftPass, double lessonFees){
        this(custID,duration,startDate, acco,liftPass);
        this.lessonFees = lessonFees;
    }

    public int getCustID(){
        return custID;
    }
    public void setCustID(int custID){
        this.custID = custID;
    }

    public int getDuration(){
        return duration;
    }
    public void setDuration (int duration){
        this.duration = duration;
    }

    public LocalDate getStartDate(){
        return startDate;
    }
    public void setStartDate (String dateStr){
        this.startDate = startDate;

    }

    public Accommodation getAcco(){
        return acco;
    }
    public void setAcco (int accID){
        this.acco = acco;
    }
    public double getLiftPass(){
        return liftPass;
    }
    public void setLiftPass (double liftPass){
        this.liftPass = liftPass;
    }
    public double getLessonFees(){
        return liftPass;
    }
    public void setLessonFees (double lessonFees){
        this.lessonFees = lessonFees;
    }


    public String toString(){
        return "Customer ID: " + custID + ", " +
                "Duration: " + duration + ", " +
                "Start date: " + startDate + ", " +
                "Accommodation: " + acco;}
}


