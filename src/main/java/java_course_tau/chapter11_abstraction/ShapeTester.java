package java_course_tau.chapter11_abstraction;

public class ShapeTester {

    public static void main(String[] args) {

        //Shape rectangle = new Shape(); - ошибка компилляции, т.к. Shape - абстрактный класс
        Shape rectangle = new Rectangle(5, 9);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
