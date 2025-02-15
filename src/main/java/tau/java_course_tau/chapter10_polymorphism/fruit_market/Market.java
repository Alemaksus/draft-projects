package tau.java_course_tau.chapter10_polymorphism.fruit_market;

public class Market {

    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();

        apple.makeJuice(); // Calls overridden method from Apple
        banana.makeJuice(); // Calls overridden method from Banana

        // Casting to access subclass-specific methods
        if (apple instanceof Apple) {
            ((Apple) apple).removeSeeds();
        }

        if (banana instanceof Banana) {
            ((Banana) banana).peel();
        }
    }
}
