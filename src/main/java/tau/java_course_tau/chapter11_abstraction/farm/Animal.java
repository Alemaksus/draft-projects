package tau.java_course_tau.chapter11_abstraction.farm;

public abstract class Animal {
    // Abstract method - must be implemented by subclasses
    public abstract void makeSound();

    // Non-abstract method - can be inherited as is
    public void eat() {
        System.out.println("This animal is eating.");
    }
}
