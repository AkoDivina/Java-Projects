public class HourlyEmployee extends Employee {
    private double baseSalary; // base salary per week
    double hour; //hours per working day
    double wage; // wage per hour of work
    public HourlyEmployee(String firstName, String lastName ,String socialSecurityNumber, double hour, double wage) {

//
        super(firstName, lastName, socialSecurityNumber);
        // if baseSalary is invalid throw exception

        if (wage < 0.0) {
            throw new IllegalArgumentException("wages must be >= 0.0 for every working hour");
        }
        this.wage = wage;
    }

    // set base salary
    public void setHour(double hour) {
        if (hour < 0.0 || hour >168) {
            throw new IllegalArgumentException("Hours of work per wage must be >= 0.0 and < 168");
        }
        this.hour = hour;



    }

    // return base salary
    public double getearnings() {
        double earnings = wage * hour;
        return  earnings;
    }

    // calculate earnings



    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "HourlyEmployee",
                super.toString(),"Earnings", getearnings());
    }
}