package tau.java_course_tau.chapter6_classes_and_objects;

public class PhoneBillPrinter {

    public static void main(String[] args) {
        // Instantiate a PhoneBill object using the constructor that accepts all fields
        PhoneBill bill = new PhoneBill("12345", 60.0, 200, 250);

        // Print the itemized bill
        printBill(bill);
    }

    // Method to print itemized bill
    public static void printBill(PhoneBill bill) {
        System.out.println("\nPhone Bill Statement");
        System.out.println("----------------------------");
        System.out.printf("Bill ID: %s\n", bill.getId());
        System.out.printf("Base Cost: $%.2f\n", bill.getBaseCost());
        System.out.printf("Allotted Minutes: %d\n", bill.getAllottedMinutes());
        System.out.printf("Minutes Used: %d\n", bill.getMinutesUsed());
        System.out.printf("Overage Fee: $%.2f\n", bill.calculateOverageFee());
        System.out.printf("Tax: $%.2f\n", bill.calculateTax());
        System.out.printf("Total: $%.2f\n", bill.calculateTotal());
    }
}
