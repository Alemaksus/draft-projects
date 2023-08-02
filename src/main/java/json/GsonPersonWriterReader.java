package json;

import com.google.gson.Gson;

public class GsonPersonWriterReader {
  public static void main(String[] args) {
    Gson gson = new Gson();
    String jsonString = "{\"name\":\"John\", \"age\":30}";

    // Чтение JSON
    GsonPerson person = gson.fromJson(jsonString, GsonPerson.class);
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());

    // Запись в JSON
    person.setName("Jane");
    person.setAge(25);
    String newJsonString = gson.toJson(person);
    System.out.println(newJsonString);
  }
}

class GsonPerson {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
