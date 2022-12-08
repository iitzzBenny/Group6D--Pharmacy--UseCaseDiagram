package PharmacyStaff;

public class Staff {

    private String firstName;
    private String lastName;
    private String jobType;
    private int staffID;

    //--Getters and Setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String newJobType) {
        this.jobType = newJobType;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int newStaffID) {
        this.staffID = newStaffID;
    }

    //--Constructor
    public Staff(String firstName, String lastName, String jobType, int staffID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobType = jobType;
        this.staffID = staffID;
    }

    //--toString
    public String toString() {
        return "Confirmed by: " + this.jobType + " "
                + this.firstName +  " staffID: " + this.staffID;
    }
}
