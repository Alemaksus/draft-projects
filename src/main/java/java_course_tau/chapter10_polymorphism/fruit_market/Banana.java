package java_course_tau.chapter10_polymorphism.fruit_market;

public class Banana extends Fruit {

    public Banana() {
        super(105); // Setting calories for a banana
    }

    public void peel() {
        System.out.println("Banana is peeled.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smoothie is made.");
    }
}
