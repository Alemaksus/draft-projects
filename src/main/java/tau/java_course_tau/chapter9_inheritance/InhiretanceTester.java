package tau.java_course_tau.chapter9_inheritance;

public class InhiretanceTester {

    public static void main(String[] args) {

//      Person person = new Person();
//      Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
    }

    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
