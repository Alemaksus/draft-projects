package java_course_tau.chapter6_classes_and_objects;

public class PhoneBill {

    private String id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    // Default constructor
    public PhoneBill() {
        this.id = "N/A";
        this.baseCost = 50.0;  // Default base cost
        this.allottedMinutes = 100;  // Default allotted minutes
        this.minutesUsed = 0;  // Default minutes used
    }

    // Constructor that accepts only the ID
    public PhoneBill(String id) {
        this.id = id;
        this.baseCost = 50.0;  // Default base cost
        this.allottedMinutes = 100;  // Default allotted minutes
        this.minutesUsed = 0;  // Default minutes used
    }

    // Constructor that accepts all fields
    public PhoneBill(String id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    // Method to calculate overage fee
    public double calculateOverageFee() {
        int overageMinutes = Math.max(minutesUsed - allottedMinutes, 0);  // Only calculate overage if minutesUsed exceeds allottedMinutes
        return overageMinutes * 0.25;  // $0.25 per overage minute
    }

    // Method to calculate tax
    public double calculateTax() {
        double subtotal = baseCost + calculateOverageFee();
        return subtotal * 0.15;  // 15% tax
    }

    // Method to calculate total amount
    public double calculateTotal() {
        return baseCost + calculateOverageFee() + calculateTax();
    }

    // Getters and Setters (optional for further manipulation if needed)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }
}
