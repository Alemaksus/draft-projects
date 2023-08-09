package streams;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class UserAge {

  @Test
  public void allUsersAreAdults() {
    List<User> users = getUsersFromDatabaseOrApi(); // предположим, это метод, который возвращает список пользователей

    boolean allUsersAreAdults = users.stream()
        .allMatch(user -> user.getAge() >= 18);

    assertTrue(allUsersAreAdults, "Not all users are adults");
  }

  private List<User> getUsersFromDatabaseOrApi() {
    // Вариант 1: Получение пользователей из базы данных
    /*
    EntityManager entityManager = ... // получите EntityManager из вашего контекста
    TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
    return query.getResultList();
    */

    // Вариант 2: Получение пользователей из REST API
    /*
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.exchange(
        "https://api.example.com/users",
        HttpMethod.GET,
        null,
        new ParameterizedTypeReference<List<User>>() {})
        .getBody();
    */

    // Вариант 3: Генерация тестовых данных
    return Arrays.asList(
        new User(25),
        new User(30),
        new User(18)
    );
  }
}
