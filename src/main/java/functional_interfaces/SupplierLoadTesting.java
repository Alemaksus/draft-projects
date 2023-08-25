package functional_interfaces;

import java.util.function.Supplier;
import java.util.Random;

public class SupplierLoadTesting {

  public static void main(String[] args) {
    Supplier<String> userIdSupplier = () -> "User" + new Random().nextInt(10000);

    for (int i = 0; i < 1000; i++) {
      String userId = userIdSupplier.get();
      callApiEndpoint(userId);
    }
  }
  private static void callApiEndpoint(String userId) {
    // Here would be a call to a specific API endpoint using userId
    // For example, getting information about the user or updating his data
    System.out.println("API вызван для пользователя: " + userId);
  }

}
