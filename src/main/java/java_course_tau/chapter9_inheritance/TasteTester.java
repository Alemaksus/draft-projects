package java_course_tau.chapter9_inheritance;

public class TasteTester {
    public static void main(String[] args) {
        // Create a regular cake
        Cake regularCake = new Cake();
        regularCake.setFlavor("Chocolate");
        regularCake.setPrice(20.0);
        System.out.println("Regular Cake: Flavor = " + regularCake.getFlavor() + ", Price = " + regularCake.getPrice());

        // Create a Birthday Cake
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("Vanilla");
        birthdayCake.setPrice(25.0);
        birthdayCake.setCandles(10);
        System.out.println("Birthday Cake: Flavor = " + birthdayCake.getFlavor() + ", Price = " + birthdayCake.getPrice() + ", Candles = " + birthdayCake.getCandles());

        // Create a Wedding Cake
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Red Velvet");
        weddingCake.setPrice(50.0);
        weddingCake.setTiers(3);
        System.out.println("Wedding Cake: Flavor = " + weddingCake.getFlavor() + ", Price = " + weddingCake.getPrice() + ", Tiers = " + weddingCake.getTiers());
    }
}
