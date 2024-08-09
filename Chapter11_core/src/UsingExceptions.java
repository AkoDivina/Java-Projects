// // Fig. 11.5: UsingExceptions.java
//         // try…catch…finally exception handling mechanism.
//
//         public class UsingExceptions {
// public static void main(String[] args) {
//         try {
//             throwException();
//             }
//         catch (Exception exception) { // exception thrown by throwException
//              System.err.println("Exception handled in main");
//             }
//
//         doesNotThrowException();
//         }
//
//        // demonstrate try…catch…finally
//       public static void throwException()
//               throws Exception {
//        try { // throw an exception and immediately catch it
//             System.out.println("Method throwException");
//             throw new Exception(); // generate exception
//             }
//         catch (Exception exception) { // catch exception thrown in try
//             System.err.println(
//                    "Exception handled in method throwException");
//             throw exception; // rethrow for further processing
//
//             // code here would not be reached; would cause compilation erro
//             }
//         finally { // executes regardless of what occurs in try…catch
//             System.err.println("Finally executed in throwException");
//             }
//
//         // code here would not be reached; would cause compilation errors
//         }
//
//         // demonstrate finally when no exception occurs
//         public static void doesNotThrowException() {
//         try { // try block does not throw an exception
//             System.out.println("Method doesNotThrowException");
//             }
//         catch (Exception exception) { // does not execute
//             System.err.println(exception);
//             }
//         finally { // executes regardless of what occurs in try…catch
//             System.err.println("Finally executed in doesNotThrowException");
//         }
//
//         System.out.println("End of method doesNotThrowException");
//         }
// }
//
//

// Fig. 11.6: UsingExceptions.java
 // Stack unwinding and obtaining data from an exception object.

         public class UsingExceptions {
 public static void main(String[] args) {
         try {
             method1();
            }
         catch (Exception exception) { // catch exception thrown in method110
            System.err.printf("%s%n%n",exception.getMessage());
             exception.printStackTrace();

             // obtain the stack-trace information
             StackTraceElement[] traceElements = exception.getStackTrace();

             System.out.printf("%nStack trace from getStackTrace:%n");
             System.out.println("Class\t\t\t\tFile\t\t\t\t\tLine\tMethod");

             // loop through traceElements to get exception description
             for (StackTraceElement element : traceElements) {
                 System.out.printf("%s\t\t", element.getClassName());
                 System.out.printf("%s\t", element.getFileName());
                  System.out.printf("%s\t\t", element.getLineNumber());
                 System.out.printf("%s%n", element.getMethodName());
                 }
             }
         }

         // call method2; throw exceptions back to main
         public static void method1()
                 throws Exception {

         method2();
         }

         // call method3; throw exceptions back to method1
         public static void method2()
                 throws Exception {
         method3();
         }
         // throw Exception back to method2
         public static void method3()
                 throws Exception {
         throw new Exception("Exception thrown in method3");
         }
 }

