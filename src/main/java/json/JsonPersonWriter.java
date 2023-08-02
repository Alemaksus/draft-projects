package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonPersonWriter {

  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();
    String jsonString = "{\"name\":\"John\", \"age\":30}";

    try {
      Person person = objectMapper.readValue(jsonString, Person.class);
      System.out.println("Name: " + person.getName());
      System.out.println("Age: " + person.getAge());
    } catch (IOException e) {
      e.printStackTrace();
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
}


