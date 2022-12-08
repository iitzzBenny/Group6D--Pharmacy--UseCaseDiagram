package Drugs;
import CustomerPackage.Customer;

public class Appointment extends Customer {

    public Appointment(String firstName, String lastName, int age, String address, String customerID) {
        super(firstName, lastName, age, address, customerID);
    }

    public void updatePrescription(String firstName, String customerID, Boolean isValid, String medicationName){

        if (isValid){
            System.out.println("Drugs.Prescription Updated; Thank you...");
            System.out.println();
        }
        else{
            System.out.println("Please Refer CustomerPackage.Customer to GeneralPractitioner.GP");
            System.out.println();
        }

    }
}
