//// // Fig. 9.6: BasePlusCommissionEmployee.java
////         // BasePlusCommissionEmployee class represents an employee who receives
////         // a base salary in addition to commission.
////         public class BasePlusCommissionEmployee {
//// private final String firstName;
//// private final String lastName;
//// private final String socialSecurityNumber;
//// private double grossSales; // gross weekly sales
////private double commissionRate; // commission percentage
//// private double baseSalary; // base salary per week
////
////         // six-argument constructor
////         public BasePlusCommissionEmployee(String firstName, String lastName,
//// String socialSecurityNumber, double grossSales,
////double commissionRate, double baseSalary) {
////         // implicit call to Object's default constructor occurs here
////
////         // if grossSales is invalid throw exception
////        if (grossSales < 0.0) {
////             throw new IllegalArgumentException("Gross sales must be >= 0.0"); }
////
////         // if commissionRate is invalid throw exception
////         if (commissionRate <= 0.0 || commissionRate >= 1.0) {
////             throw new IllegalArgumentException(
////                     "Commission rate must be > 0.0 and < 1.0");
////             }
////
////         // if baseSalary is invalid throw exception
////         if (baseSalary < 0.0) {
////             throw new IllegalArgumentException("Base salary must be >= 0.0");
////         }
////
////         this.firstName = firstName;
////         this.lastName = lastName;
////         this.socialSecurityNumber = socialSecurityNumber;
////         this.grossSales = grossSales;
////         this.commissionRate = commissionRate;
////         this.baseSalary = baseSalary;
////         }
////
////         // return first name
////         public String getFirstName() {
////             return firstName;
////         }
////
////         // return last name
////         public String getLastName() {
////             return lastName;
////         }
////
////         // return social security number
////         public String getSocialSecurityNumber() {
////
////             return socialSecurityNumber;
////         }
////
////         // set gross sales amount
////         public void setGrossSales(double grossSales) {
////         if (grossSales < 0.0) {
////             throw new IllegalArgumentException("Gross sales must be >= 0.0"); }
////
////         this.grossSales = grossSales;
////        }
////
////         // return gross sales amount
////         public double getGrossSales() {return grossSales;}
////
////         // set commission rate
////         public void setCommissionRate(double commissionRate) {
////         if (commissionRate <= 0.0 || commissionRate >= 1.0) {
////             throw new IllegalArgumentException(
////                     "Commission rate must be > 0.0 and < 1.0");             }
////
////         this.commissionRate = commissionRate;
////         }
////         // return commission rate
////         public double getCommissionRate() {
////             return commissionRate;
////         }
////
////         // set base salary
////         public void setBaseSalary(double baseSalary) {
////        if (baseSalary < 0.0) {
////             throw new IllegalArgumentException("Base salary must be >= 0.0"); }
////
////         this.baseSalary = baseSalary;
////         }
////
////         // return base salary
////         public double getBaseSalary() {
////             return baseSalary;
////         }
////
//////          calculate earnings
////         public double earnings() {
//////              public double getBaseSalary(){
////
////                  return baseSalary;
//////              }
////         }
////
////
////         // return String representation of BasePlusCommissionEmployee
////         @Override
//// public String toString() {
////         return String.format(
////                 "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
////                 "base-salaried commission employee", firstName, lastName,
////                 "social security number", socialSecurityNumber,
////                 "gross sales", grossSales,
////                 "commission rate", commissionRate,
////                 "base salary", baseSalary);
////         }
//// }
//
//
//
//
//
/////
//
//
//
//// Fig. 9.9: BasePlusCommissionEmployee.java
// // BasePlusCommissionEmployee inherits protected instance
//         // variables from CommissionEmployee.
//
//         public class BasePlusCommissionEmployee extends CommissionEmployee {
//             private double baseSalary; // base salary per week
//
//             // six-argument constructor
//             public BasePlusCommissionEmployee(String firstName, String lastName,
//                                               String socialSecurityNumber, double grossSales,
//                                               double commissionRate, double baseSalary) {
//                 super(firstName, lastName, socialSecurityNumber,
//                         grossSales, commissionRate);
//
//                 // if baseSalary is invalid throw exception
//                 if (baseSalary < 0.0) {
//                     throw new IllegalArgumentException("Base salary must be >= 0.0");
//
//                 }
//
//                 this.baseSalary = baseSalary;
//             }
//
//             // set base salary
//             public void setBaseSalary(double baseSalary) {
//                 if (baseSalary < 0.0) {
//                     throw new IllegalArgumentException("Base salary must be >= 0.0");
//
//                 }
//
//                 this.baseSalary = baseSalary;
//             }
//
//             // return base salary
//             public double getBaseSalary() {
//                 return baseSalary;
//             }
//
//             // calculate earnings
//             @Override // indicates that this method overrides a superclass method
//             public double earnings() {
//                 return baseSalary + (commissionRate * grossSales);
//             }
//
//             // return String representation of BasePlusCommissionEmployee
//             @Override
//             public String toString() {
//                 return String.format(
//                         "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
//                         "base-salaried commission employee", firstName, lastName,
//                         "social security number", socialSecurityNumber,
//                         "gross sales", grossSales, "commission rate", commissionRate,
//                         "base salary", baseSalary);
//             }
//         }





// Fig. 9.11: BasePlusCommissionEmployee.java
 // BasePlusCommissionEmployee class inherits from CommissionEmployee
         // and accesses the superclass’s private data via inherited
         // public methods.
         public class BasePlusCommissionEmployee extends CommissionEmployee {
 private double baseSalary; // base salary per week

        // six-argument constructor
        public BasePlusCommissionEmployee(String firstName, String lastName,
 String socialSecurityNumber, double grossSales,
 double commissionRate, double baseSalary) {
         super(firstName, lastName, socialSecurityNumber,
                 grossSales, commissionRate);

         // if baseSalary is invalid throw exception
         if (baseSalary < 0.0) {
             throw new IllegalArgumentException("Base salary must be >= 0.0"); }

         this.baseSalary = baseSalary;
         }

         // set base salary
         public void setBaseSalary(double baseSalary) {
         if (baseSalary < 0.0) {
             throw new IllegalArgumentException("Base salary must be >= 0.0"); }

         this.baseSalary = baseSalary;
         }

         // return base salary
         public double getBaseSalary() {
            return baseSalary;
        }

         // calculate earnings
         @Override
 public double earnings() {
            return (  getBaseSalary() + super.earnings()   );
        }

         // return String representation of BasePlusCommissionEmployee
         @Override
 public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                 super.toString(), "base salary", getBaseSalary());
         }
 }