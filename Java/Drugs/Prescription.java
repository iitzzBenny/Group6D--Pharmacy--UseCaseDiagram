package Drugs;

import Drugs.Medication;

public class Prescription extends Medication {

    Boolean isValid = false;
    int amount;


    //--Drugs.Prescription Drugs.Medication
    public void Ventolin() {
        isPrescription = true;
        medicationName = "Ventolin";
        System.out.println("Ask CustomerPackage.Customer to Present Drugs.Prescription...");
    }

    public void Proair() {
        isPrescription = true;
        medicationName = "Proair";
        System.out.println("Ask CustomerPackage.Customer to Present Drugs.Prescription...");
    }

    public void Novolog() {
        isPrescription = true;
        medicationName = "Novolog";
        System.out.println("Ask CustomerPackage.Customer to Present Drugs.Prescription...");
    }
}

