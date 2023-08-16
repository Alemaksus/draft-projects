import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorJUnitTest {

  public int add(int a, int b) {
    return a + b;
  }

  @Test
  public void testAdd() {
    CalculatorJUnitTest calculator = new CalculatorJUnitTest();
    int result = calculator.add(5, 3);
    assertEquals(8, result, "Ошибка: 5 + 3 должно быть равно 8");
  }

}
