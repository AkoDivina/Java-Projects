public class Employee {

    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;


    // my  constructor
    public Employee(String firstName, String lastName,
                    String socialSecurityNumber, double wage, double hour) {
        // implicit call to Object constructor occurs here

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hour = hour;
        this.wage = wage;

    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public String gethour() {
        return hour;
    }
    public String getwage() {
        return wage;
    }

    public String toString() {
        return String.format("%s: %s %s %n %s: %s",
                "commission employee", getfirstName(), getlastName(),
                "social security number",  getSocialSecurityNumber());
    }
}
