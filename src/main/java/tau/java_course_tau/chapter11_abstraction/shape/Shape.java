package tau.java_course_tau.chapter11_abstraction.shape;

public abstract class Shape {

    abstract double calculateArea();

    public void print() {
        System.out.println("I'm a shape");
    }
}
