package tau.java_course_tau.chapter12_exceptions;

public class DividingByZero {

    public static void main(String[] args) {
//        try {
//            int c = 30 / 0; // This will cause an ArithmeticException
//            System.out.println("Result: " + c);
//        } catch (ArithmeticException e) {
//            System.out.println("Error: Cannot divide by zero!");
//        } finally {
//            System.out.println("Division is fun"); // This will always be executed
//        }
//    }

            try{
                int c = 30/0;
            }catch(ArithmeticException e){
                System.out.println("Dividing by zero is not permitted");
            }finally{
                System.out.println("Division is fun!");
            }
        }
}

