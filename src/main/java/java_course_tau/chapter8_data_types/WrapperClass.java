package java_course_tau.chapter8_data_types;

public class WrapperClass {

    public static void converterDecimalToInt() {
        double[] numbers = {1.5, 3.39, 45.5, 222.6};

        for (double number : numbers) {
            System.out.println((int) number);  // Преобразуем в int вручную
        }
    }

    public static void main(String[] args) {
        // Вызов метода из main
        converterDecimalToInt();
    }
}
