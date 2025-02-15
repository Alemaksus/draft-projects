package tau.java_course_tau.chapter11_abstraction.product;

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode(){
        return "no barcode";
    }
}
