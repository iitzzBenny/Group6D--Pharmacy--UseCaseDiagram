import CustomerPackage.Customer;

public class Vaccination extends Customer {

    enum vaccinationType{
        Pfizer,
        Polio,
        Tetanus
    }

    Boolean completed = false;

    public vaccinationType vacType;

    public Vaccination(String firstName, String lastName, int age, String address, String customerID) {
        super(firstName, lastName, age, address, customerID);
    }

    public void bookedVaccination(String firstName, String customerID, Boolean completed, vaccinationType vacType) {
        if (completed){
            System.out.println("Thank you for taking your vaccine with us, " + firstName);
        }
        else {
            System.out.println(firstName + " vaccination Status: " + "Incomplete");
        }
    }
}
