package tau.java_course_tau.chapter10_polymorphism.fruit_market;

public class Fruit {

    protected int calories;

    public Fruit(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Juice is made.");
    }
}
