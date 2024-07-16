////      3. 11.16 (Catching Exceptions with Superclasses) Use inheritance to create
////an exception superclass (called ExceptionA) and exception subclasses
////ExceptionB and ExceptionC, where ExceptionB inherits from
////ExceptionA and ExceptionC inherits from ExceptionB. Write a
////program to demonstrate that the catch block for type ExceptionA
////catches exceptions of types ExceptionB and ExceptionC.
//
//
        public class CatchingExceptionsWithSuperClass {
//
//            public static void main(String[] args) {
//
//                try
//
//                {
//                    ExceptionA();
//                }
//                catch(Exception exception){ // catch exception thrown in method110
//
//                    System.err.printf("%s%n%n", exception.getMessage());
//                    exception.printStackTrace();
//                    StackTraceElement[] traceElements = exception.getStackTrace();
//
//                    System.out.printf("%nStack trace from getStackTrace:%n");
//
//                    private class ExceptionA extends Exception {
//
//                throws Exception {
//                            ExceptionB();
//                        }
//
//                    private class ExceptionB extends ExceptionA {
//                 throws Exception {
//                            ExceptionC();
//                        }
//
//                     private class ExceptionC extends ExceptionB {
//              System.err.printf("%s%n%n",exception.getMessage());
//                    exception.printStackTrace();
//                            }
//
//
//                        }
//                    }
//                }
//            }
//        }


public void main(String[] args) {
    try {
        new ExceptionA();
    }
    catch (Exception exception) { // exceptions thrown from method1
        exception.printStackTrace();
    }
}

// call method2; throw exceptions back to main
private class ExceptionA extends Exception{
    throws Exception{
            try {
                new ExceptionB();
            }
            catch (Exception exception) { // exception thrown from method2
                try {
                    throw new Exception("Exception thrown in ExceptionA", exception);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // call method3; throw exceptions back to method1
        private class ExceptionB extends ExceptionA{
            throws Exception {
            try {
               new ExceptionC();
            }
            catch (Exception exception) { // exception thrown from method3
                throw new Exception("Exception thrown in ExceptionB", exception);
            }
        }
        // throw Exception back to method2
        private class ExceptionC extends ExceptionB{
            throw new Exception("Exception thrown in method3");
        }
         }
}
