package java_course_tau.chapter5_methods;

/* Bill Calculator Program in Java.
   Calculate the final total of someone's cell phone bill.
   Allow the operator to input the plan fee and the number of overage minutes.
   Charge the user 0.25 for every minute they were over their plan and 15% tax on the subtotal.
   Create separate methods to calculate the tax, overage fees, and final total.
   Print the itemsized bill.
   So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
   And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
   I want you to create separate methods to calculate the tax, to calculate the overage fees,
   and to calculate and print the final total. Please print this as an itemized bill.
*/

        import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the plan fee and overage minutes
        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();

        // Calculate the overage fee, tax, and total
        double overageFee = calculateOverageFee(overageMinutes);
        double tax = calculateTax(planFee + overageFee);
        double total = calculateTotal(planFee, overageFee, tax);

        // Print the itemized bill
        printBill(planFee, overageFee, tax, total);

        scanner.close();
    }

    // Method to calculate overage fee
    public static double calculateOverageFee(int overageMinutes) {
        double ratePerMinute = 0.25;
        return overageMinutes * ratePerMinute;
    }

    // Method to calculate tax
    public static double calculateTax(double subtotal) {
        double taxRate = 0.15;
        return subtotal * taxRate;
    }

    // Method to calculate the final total
    public static double calculateTotal(double planFee, double overageFee, double tax) {
        return planFee + overageFee + tax;
    }

    // Method to print the itemized bill
    public static void printBill(double planFee, double overageFee, double tax, double total) {
        System.out.println("\nPhone Bill Statement");
        System.out.printf("Plan: $%.2f\n", planFee);
        System.out.printf("Overage: $%.2f\n", overageFee);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
