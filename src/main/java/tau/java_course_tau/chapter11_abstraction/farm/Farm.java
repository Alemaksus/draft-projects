package tau.java_course_tau.chapter11_abstraction.farm;

public class Farm {
    public static void main(String[] args) {
        // Create instances of Pig and Duck
        Animal pig = new Pig();
        Animal duck = new Duck();

        // Call methods on both objects
        System.out.println("Pig: ");
        pig.makeSound();
        pig.eat();

        System.out.println("\nDuck: ");
        duck.makeSound();
        duck.eat();
    }
}

