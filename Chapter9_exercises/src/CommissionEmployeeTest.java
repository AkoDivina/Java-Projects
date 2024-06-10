// Fig. 9.5: CommissionEmployeeTest.java
         // CommissionEmployee class test program.
         public class HourlyEmployeeTest {
 public static void main(String[] args) {
         // instantiate CommissionEmployee object


      HourlyEmployee employee= new HourlyEmployee("Ako", "Divina", "222-111-222", 132, 500);

//         Employee Hourlyemployee = new Employee(
//                 "Sue", "Jones", "222-222-222", "132", "520" );

         // get commission employee data
         System.out.println("Employee information obtained by get methods:");
         System.out.printf("%n%s %s%n", "First name is",
                 employee.getfirstName());
         System.out.printf("%s %s%n", "Last name is",
                 employee.getlastName());
         System.out.printf("%s %s%n", "Social security number is",
                 employee.getSocialSecurityNumber());
         System.out.printf("%s %.1f%n", "hours of work is",
                 employee.getHour());
         System.out.printf("%s %.2f%n", "weekly wages are",
                 employee.earnings());

     employee.setHour(120);
     employee.wage(2300);

         System.out.printf("%n%s:%n%n%s%n",
                 "Updated employee information obtained by toString", employee.toString());
         }
 }