package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPersonReader {

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    GsonPerson person = new GsonPerson();
    person.setName("John");
    person.setAge(30);

    try {
      String jsonString = objectMapper.writeValueAsString(person);
      System.out.println(jsonString);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
  }
}

class Person {

  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
