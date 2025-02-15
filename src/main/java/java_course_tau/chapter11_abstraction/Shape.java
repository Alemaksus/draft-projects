package java_course_tau.chapter11_abstraction;

public abstract class Shape {

    abstract double calculateArea();

    public void print() {
        System.out.println("I'm a shape");
    }
}
