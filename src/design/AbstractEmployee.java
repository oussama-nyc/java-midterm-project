package design;

public abstract class AbstractEmployee {

    private char gender;
    private String employeeAddress;
    private String ssn;
    private String email;
    private String date_of_birth;


    //********* ( constructor ) ***********

    public AbstractEmployee() {
    }

    public AbstractEmployee(char gender, String employeeAddress, String ssn, String email, String date_of_birth) {
        this.gender = gender;
        this.employeeAddress = employeeAddress;
        this.ssn = ssn;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }

    //*********** ( Setter and Getter ) *********


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public abstract void holidayBonus();
    public abstract void employeeAllowance();
    public abstract void employeeRetirement();
    public void companyDescription(){
        System.out.println("Tech company sells hardware, software, and middleware.");
    }

    @Override
    public String toString() {
        return  "\nEmployee Info:" +
                "\n * gender =" + gender +
                "\n * employee Address ='" + employeeAddress + '\'' +
                "\n * ssn ='" + ssn + '\'' +
                "\n * email ='" + email + '\'' +
                "\n * date of birth ='" + date_of_birth + '\'';
    }
}
