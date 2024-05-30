 // Fig. 3.1: Account.java
 // Account class that contains a name instance variable
 // and methods to set and get its value.
public class Account{
// public static void main(String[] args){
 //name has datatype of string and is a private attribute, probably also an instance of class
 private String name; // instance variable

 // method to set the name in the object
 public void setName(String name) {
 this.name = name; // set name stores  the name
}

 // method to retrieve the name from the object
 public String getName() { //getName obtains the stored value and returns to the user
return name; // return value of name to caller
 }//end method
 }//end of class

 // Fig. 3.5: Account.java
         // Account class with a constructor that initializes the name.
//
//         public class Account {
////             public static void main(String[] args) {
//                 private String name; // instance variable
//
//                 // constructor initializes name with parameter name
//         public Account(String name) { // constructor name is class name
//                     this.name = name;
//                 }
//
//                 // method to set the name
//                 public void setName (String name){
//                     this.name = name;
//                 }
//
//                 // method to retrieve the name
//                 public String getName () {
//                     return name;
//                 }
//             }
////         }