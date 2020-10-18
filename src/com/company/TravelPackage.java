package com.company;
import java.time.LocalDate;

import java.util.*;
import java.time.*;
import java.io.*;

public class TravelPackage implements Serializable{

    private int packageID;
    private Customer customer;
    private Accommodation accommodation;
    private int duration = 0;
    private LocalDate startDate;
    private double lessons = 0.0;
    private double liftPass = 0.0;
    private double totalCost = 0.0;
    static int nextID = 1;

    public TravelPackage(){
        packageID = nextID++;
    }
    public TravelPackage(Customer customer){
        this.customer = customer;
        packageID = nextID++;
    }
    public TravelPackage(Customer customer, int duration, LocalDate startDate){
        this.customer = customer;
        this.duration = duration;
        this.startDate = startDate;
        packageID = nextID++;
    }

    //get methods
    public int getPackageID(){
        return packageID;
    }
    public Customer getCustomer(){
        return customer;
    }
    public Accommodation getAccommodation(){
        return accommodation;
    }
    public double getLiftPass(){
        return liftPass;
    }
    public double getTotalCost(){
        return totalCost;
    }
    public double getLessonsCost(){

        return lessons;
    }


    //set methods
    public void setLessonsCost(int noLessons){

        double lessonFee = customer.getLessonFee();
        System.out.println("You have 10% discount for lessons included in the package!");

        lessons = 0.9*lessonFee*noLessons;
    }

    public void setAccommodation(Accommodation acc){
        accommodation = acc;
    }

    public void setTotalCost(){
        totalCost = calcTotalCost();
    }

    public void setCustomer(Customer c){
        this.customer = c;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setStartDate(LocalDate date){
        startDate = date;
    }

    public double calcTotalCost(){
        double accCost=0.0;
        if(accommodation!=null)
            accCost = accommodation.getPricePerDay()*duration;
        return accCost + liftPass + lessons;
    }

    public void setLiftPass(double lifts){
        Scanner input = new Scanner(System.in);
     System.out.print("Choose lift pass:\n"+
                       "1 - Full day $26\n"+
                       "2 - For 5-10 days $117\n" +
                       "3 - For a season $200\n");
     int passChoice = input.nextInt();
     switch(passChoice){
       case 1:
         liftPass = 26;
       break;
       case 2:
         liftPass = 117;
       break;
       case 3:
         liftPass = 200;
       break;
       default:
         System.out.println("Enter choice 1, 2, or 3");

     }

        //liftPass = lifts;

    }

    public String toString(){
        String packageStr = "---------------------\nPackage #" + packageID +
                "\nCustomer: " + customer +
                "\nDuration: " + duration + " days. Start date: " + startDate;

        if(accommodation != null)
            packageStr+= "\nAccommodation " + accommodation;

        if (liftPass !=0.0)
            packageStr +=". Included lift pass $" + liftPass;

        if (lessons!= 0.0)
            packageStr += " and lessons fees $" + lessons +".";

        packageStr += "\nTotal cost $: " + calcTotalCost();

        return packageStr;
    }
}

