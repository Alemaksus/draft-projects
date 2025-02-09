package java_course_tau.chapter10_polymorphism.zoo;

public class Cat extends Animal {

    @Override
    public void makeSound(){
        System.out.println("meow");
    }

    public void scratch(){
        System.out.println("I am a cat. I scratch things.");
    }
}
