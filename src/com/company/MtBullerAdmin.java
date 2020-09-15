package com.company;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.*;


public class MtBullerAdmin extends MtBullerResort {

    public void populateList() {

        Accommodation[] arrOfAccommodation = {
                new Accommodation(1, "Lodge",  180.0, true),
                new Accommodation(101, "Lodge",  110.0, true),
                new Accommodation(2, "Lodge",  150.0, true),
                new Accommodation(103, "Lodge",  100.0, true),
                new Accommodation(3, "Apartment",  170.0, true),
                new Accommodation(104, "Apartment",  120.0, true),
                new Accommodation(11, "Hotel",  150.0, true),
                new Accommodation(12, "Hotel",  160.0, true),
                new Accommodation(13, "Hotel",  120.0, true),
                new Accommodation(14, "Hotel",  140.0, true)};

        Customer[] arrOfCustomers = {
                new Customer(3001, "Dio", "Expert"),
                new Customer(3002, "Joseph", "Beginner"),
                new Customer(3004, "Jotaro", "Intermediate")
        };
        for(int i = 0; i < arrOfAccommodation.length; i++) accommodation.add(arrOfAccommodation[i]);
        for(int i = 0; i < arrOfCustomers.length; i++) customer.add(arrOfCustomers[i]);
    }

    public void run(){

        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag) {
            System.out.println("Mt Buller Admin options\n------------------------\n"+
                    "1: Display all accommodations\n" +
                    "2: Display available accommodations\n"+
                    "3: Add customer\n"+
                    "4: List customers\n"+
                    "5: Create a package\n" +
                    "6: Add a lift pass to package\n"+
                    "7: Add lesson fees to package\n"+
                    "8: List packages\n"+
                    "9: Save packages to file\n"+
                    "10: Read packages from file\n"+
                    "11: Quit\n");

            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    displayAllAcc();
                    break;
                case 2:
                    displayAvailableAcc();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    listCustomers();
                    break;
                case 5:
                    addPackage();
                    break;
                case 6:
                    //addLiftPass();
                    break;
                case 7:
                    //addLessonFees();
                    break;
                case 8:
                    listPackages();
                    break;
                case 9:
                    //savePackages();
                    break;
                case 10:
                    //readPackages();
                    break;
                case 11:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }


    public void displayAllAcc() {
        for (Accommodation a:accommodation) System.out.println(a);
    }

    public void displayAvailableAcc() {
        for (Accommodation a: accommodation) {
            if (a.availability) System.out.println(a);
        }
    }

    public void addCustomer() {
        //TODO turn this into a scanner!
        int accID = 999;
        String name = "Hello";
        String level = "Intermediate";
        Customer a = new Customer(accID, name, level);
        customer.add(a);
        listCustomers();
    }

    public void listCustomers() {
        for (Customer c:customer) System.out.println(c);
    }

    public void addPackage() {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Customer ID? ");
        int custID = input.nextInt();
        input.nextLine();
        System.out.print("Duration? ");
        int dur = input.nextInt();
        input.nextLine();

        System.out.print("Date in format yyyy-mm-dd? ");
        String dateStr = input.nextLine();
        LocalDate date = null;
        try{
            date = LocalDate.parse(dateStr);
        }
        catch(Exception e){}


         */
        LocalDate date = LocalDate.parse("2020-10-10");
        TravelPackage travel = new TravelPackage(1, 2, date);
        addAccommodation(travel);
        travelpackage.add(travel);
        listPackages();
    }

    public void addAccommodation(TravelPackage pg) {
        //TODO list available acc and scan user input
        int selectedID = 101;
        //search accomo array for the ID
        for (Accommodation ac: accommodation){
            if (ac.accID == selectedID) {
                ac.availability = false;
                pg.acco = ac;
            }
        }
    }



    public void addLiftPass() {}

    public void addLessonFees() {}

    public void listPackages() {
        for (TravelPackage t:travelpackage) System.out.println(t);
    }


    public static void main(String[] args) {

        MtBullerAdmin mba = new MtBullerAdmin();
        mba.populateList();
        mba.run();

    }




}


