package tau.java_course_tau.chapter10_polymorphism.zoo;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("woof");
    }

    public void fetch(){
        System.out.println("fetch is fun!");
    }
}
