// Fig. 10.4: Employee.java
         // Employee abstract superclass.

//abstract class employee is also created for the same purpose as abstract method earnings page 47
         public abstract class Employee {
    //abstract classes do not need objects e.g int x;
    //or objects cannot work in an abstract class
    //but instance variables as below can be declared and work
 private final String firstName;
 private final String lastName;
 private final String socialSecurityNumber;

  // constructor
         public Employee(String firstName, String lastName,String socialSecurityNumber) {
             this.firstName = firstName;
             this.lastName = lastName;
             this.socialSecurityNumber = socialSecurityNumber;
             }

         // return first name
         public String getFirstName() {
             return firstName;
         }

         // return last name
         public String getLastName() {
             return lastName;
         }

         // return social security number
         public String getSocialSecurityNumber() {
             return socialSecurityNumber;
         }
                      // return String representation of Employee object

             @Override
        public String toString() {
                  return String.format("%s %s %n social security number: %s",
                          getFirstName(), getLastName(), getSocialSecurityNumber());
                  }

         // abstract method must be overridden by concrete subclasses

             //why is earnings declared as an abstract method
             //employee earnings cannot be calculated because there are different types of employees
             //each type of employee needs to inherit this method and calculate it based on its own specifications
         public abstract double earnings(); // no implementation here
 }