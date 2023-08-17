package patterns;

/*The Decorator pattern is used
 to add new functionality to an object without changing its structure.
  It wraps an object and provides additional features.*/

public class DecoratorCoffee {
  String getDescription() {
    return "Простой кофе";
  }
}

class MilkDecorator extends DecoratorCoffee {
  DecoratorCoffee coffee;

  MilkDecorator(DecoratorCoffee coffee) {
    this.coffee = coffee;
  }

  @Override
  String getDescription() {
    return coffee.getDescription() + " с молоком";
  }
}
