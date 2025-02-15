package tau.java_course_tau.chapter9_inheritance;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return  sides * length;
    }

    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
