package Drugs;

public class Medication {

    //--Variables for all Medicine
    public boolean isPrescription;
    public String medicationName;

    //--Stock Amount Non-Drugs.Prescription
    public int panadolStock = 43;
    public int strepsilStock = 98;
    public int advilStock = 1;
    //--Stock Amount for Drugs.Prescription
    public int ventolinStock = 33;
    public int proairStock = 1;
    public int novologStock = 0;

    //--NON - PRESCRIPTION MEDICINE
    public void Panadol(int requestedAmount) {
        isPrescription = false;
        medicationName = "Panadol";

        if (panadolStock == 0 || (panadolStock - requestedAmount < 0)) { //Ensures Sale Has Enough Stock To Go Through
            System.out.println("NOT ENOUGH STOCK - Current Stock is: " + panadolStock);
        } else {
            panadolStock = panadolStock - requestedAmount; //Updates the Stock Amount based on transaction
            System.out.println(medicationName + " Remaining Stock: " + panadolStock);
        }
    }

    public void Strepsil(int requestedAmount) {
        isPrescription = false;
        medicationName = "Strepsil";

        if (strepsilStock == 0 || (strepsilStock - requestedAmount < 0)) { //Ensures Sale Has Enough Stock To Go Through
            System.out.println("NOT ENOUGH STOCK - Current Stock is: " + strepsilStock);
        } else {
            strepsilStock = strepsilStock - requestedAmount;
            System.out.println(medicationName + " Remaining Stock: " + strepsilStock);
        }
    }

    public void Advil(int requestedAmount) {
        isPrescription = false;
        medicationName = "Advil";

        if (advilStock == 0 || (advilStock - requestedAmount < 0)) { //Ensures Sale Has Enough Stock To Go Through
            System.out.println("NOT ENOUGH STOCK - Current Stock is: " + advilStock);
        } else {
            advilStock = advilStock - requestedAmount;
            System.out.println(medicationName + " Remaining Stock: " + advilStock);
        }
    }

}
