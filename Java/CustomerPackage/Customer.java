package CustomerPackage;

import Drugs.Prescription;

import java.util.Objects;

public class Customer extends Prescription {

    //--Information--
    public String firstName;
    public String lastName;
    public int age;

    public String address;
    public String customerID;

    //Constructor
    public Customer(String firstName, String lastName, int age, String address, String customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.customerID = customerID;
    }

    //--toString
    public String toString() {
        return "CustomerPackage.Customer: " + this.firstName + " ID: "
                + this.customerID;
    }

    //--PRESCRIPTION UPDATES BASED ON IF VALID AND IF STOCK IS ENOUGH FOR REQUEST
    public void customerPrescription(String firstName, String customerID, Boolean isValid, String medicationName, int requestedAmount) {
        System.out.print(firstName + " ID: " + customerID +
                " Has Valid Drugs.Prescription: " + isValid + " for: " + medicationName);
        System.out.println();

        if (isValid) {

            if (Objects.equals(medicationName, "Ventolin")) {
                if (ventolinStock == 0 || (ventolinStock - requestedAmount < 0)) { //Ensures Sale Has Enough Stock To Go Through
                    System.out.println("NOT ENOUGH STOCK - Current Stock is: " + ventolinStock);
                } else {
                    ventolinStock = ventolinStock - requestedAmount;
                    System.out.println(medicationName + " Remaining Stock: " + ventolinStock);
                }
            }
            if (Objects.equals(medicationName, "Proair")) {
                if (proairStock == 0 || (proairStock - requestedAmount < 0)) { //Ensures Sale Has Enough Stock To Go Through
                    System.out.println("NOT ENOUGH STOCK - Current Stock is: " + proairStock);
                } else {
                    proairStock = proairStock - requestedAmount;
                    System.out.println(medicationName + " Remaining Stock: " + proairStock);
                }
            }
            if (Objects.equals(medicationName, "Novolog")) {
                if (novologStock == 0 || (novologStock - requestedAmount < 0)) { //Ensures Sale Has Enough Stock To Go Through
                    System.out.println("NOT ENOUGH STOCK - Current Stock is: " + novologStock);
                } else {
                    novologStock = novologStock - requestedAmount;
                    System.out.println(medicationName + " Remaining Stock: " + novologStock);
                }
            }
        }
        else {
            System.out.println("Invalid Drugs.Prescription - Create Drugs.Appointment...");
            System.out.println();
        }
    }

}