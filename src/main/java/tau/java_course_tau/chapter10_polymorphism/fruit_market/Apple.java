package tau.java_course_tau.chapter10_polymorphism.fruit_market;

public class Apple extends Fruit {

    public Apple() {
        super(95); // Setting calories for an apple
    }

    public void removeSeeds() {
        System.out.println("Seeds removed from the apple.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made.");
    }
}
