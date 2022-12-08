import CustomerPackage.Customer;
import Drugs.Appointment;
import Drugs.Prescription;
import GeneralPractitioner.GP;
import PharmacyStaff.*;

public class Main {

    public static void main(String[] args) {


        Customer c1 = new Customer("Ben", "Tzirki", 20, "12 Sheephill", "A01");
        System.out.println(c1);

        Prescription p1 = new Prescription();
        p1.Ventolin();
        c1.customerPrescription(c1.firstName,c1.customerID,false,p1.medicationName,1);
        SalesAssistant s1 = new SalesAssistant("Samantha", "Gerome", "Sales Assistant", 114);
        System.out.println(s1);

        Appointment a1 = new Appointment(c1.firstName, c1.lastName, c1.age, c1.address,c1.customerID);
        a1.updatePrescription(c1.firstName,c1.customerID,true,c1.medicationName);

        c1.customerPrescription(c1.firstName,c1.customerID,true,p1.medicationName,1);
        System.out.println(s1);

        System.out.println("************************************************************************");
        System.out.println();

        Customer c2 = new Customer("Joshua", "Tracey", 20, "15 Dabloon Lane", "A02");
        System.out.println(c2);
        Prescription p2 = new Prescription();
        p2.Proair();
        c2.customerPrescription(c2.firstName, c2.customerID, false, p2.medicationName, 1);

        Appointment a2 = new Appointment(c2.firstName, c2.lastName,20,c2.address, c2.customerID);
        a2.updatePrescription(c2.firstName,"A02", false, p2.medicationName);

        GP g1 = new GP(c2.firstName, c2.lastName,20,c2.address, c2.customerID);
        g1.updatedGP(c2.firstName,c2.customerID, true, p2.medicationName);
        System.out.println(g1);

        c2.customerPrescription(c2.firstName,c2.customerID,true, p2.medicationName,1);

        System.out.println("*************************************************************");
        System.out.println();

        Customer c3 = new Customer("Matt", "Smith", 33, "99 Blvd", "A03");
        Vaccination v1 = new Vaccination(c3.firstName,c3.lastName,c3.age,c3.address,c3.customerID);
        v1.bookedVaccination(c3.firstName,c3.customerID,false, Vaccination.vaccinationType.Pfizer);

    }
}
