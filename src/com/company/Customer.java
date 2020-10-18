package com.company;

import java.io.*;

/**
 *
 * @author olga
 */

public class Customer implements Serializable{

    private int custId;
    private String name;
    private String skiingLevel;
    static int nextID = 10;
    private double lessonFee;


    public Customer () {
        custId = nextID++;
    }

    public Customer (String name) {
        this.name = name;
        custId = nextID++;
    }
    public Customer (String name, String skillsLevel) {
        custId = nextID++;
        this.name = name;
        this.skiingLevel = skillsLevel;
        setLessonFee();

    }
    public int getCustId () {
        return custId;
    }
    public String getName () {
        return name;
    }
    public String getSkillsLevel(){
        return skiingLevel;
    }
    public void setSkiingLevel(String skiingLevel){
        this.skiingLevel=skiingLevel;
    }

    public void setName (String name) {
        this.name = name;
    }
    public void setLessonFee() {

        if(skiingLevel.equalsIgnoreCase("Beginner"))
            lessonFee = 25;
        else if(skiingLevel.equalsIgnoreCase("Intermediate"))
            lessonFee = 20;
        else if(skiingLevel.equalsIgnoreCase("Expert"))
            lessonFee = 15;
    }

    public double getLessonFee(){
        return lessonFee;
    }
    public String toString () {

        String custStr = "ID: " + custId + ", name: " + name + ", level: " + skiingLevel;

        return custStr;
    }

}
// have to utilise getters and setters for input and retrieval