package streams.animals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.logging.log4j.core.util.JsonUtils;

public class Main {

  public static void main(String[] args) {
    List<Animal> animals = getAnimals();

//    Old apaproach (before Java8):
//
//    List<Animal> predators = new ArrayList<>();
//
//    for (Animal animal : animals) {
//      if (animal.getClassification().equals(Classification.PREDATOR)) {
//        predators.add(animal);
//      }
//    }
//    predators.forEach(System.out::println);

    // New approach with streams (Declarative approach) with new methods:

    // 1-st method - Filter:
    List<Animal> predators = animals.stream()
        .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
        .collect(Collectors.toList());
    //predators.forEach(System.out::println);

    // 2-nd method - Sort:

    List<Animal> sorted = animals.stream()
        .sorted(Comparator.comparing(Animal::getAge)
            .thenComparing(Animal::getClassification)
            .reversed())
        .collect(Collectors.toList());
    //sorted.forEach(System.out::println);

    // All match:

    boolean allMatch = animals.stream()
        .allMatch(animal -> animal.getAge() > 10);
    //System.out.println(allMatch);

    // Any match:

    boolean anyMatch = animals.stream()
        .anyMatch(animal -> animal.getAge() > 10);
    //System.out.println(anyMatch);

    // None match:
    boolean noneMatch = animals.stream()
        .noneMatch(animal -> animal.getName().equals("Lynx"));
    //System.out.println(noneMatch);

    // Max:
//    animals.stream()
//        .max(Comparator.comparing(Animal::getAge))
//        .ifPresent((System.out::println));

//    // Min:
//    animals.stream()
//        .min(Comparator.comparing(Animal::getAge))
//        .ifPresent((System.out::println));

    // Group:
    Map<Classification, List<Animal>> classificationListMap = animals.stream()
        .collect(Collectors.groupingBy(Animal::getClassification));

//    classificationListMap.forEach(((classification, animals1) -> {
//      System.out.println(classification);
//      animals1.forEach(System.out::println);
//      System.out.println();
//    }));

    // Channing:

    Optional<String> oldestAgePredator = animals.stream()
        .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
        .max(Comparator.comparing(Animal::getAge))
        .map(Animal::getName);

    oldestAgePredator.ifPresent(System.out::println);
  }

  private static List<Animal> getAnimals() {
    return List.of(
        new Animal("Elephant", 20, Classification.HERBIVORE),
        new Animal("Lion", 10, Classification.PREDATOR),
        new Animal("Hyena", 11, Classification.PREDATOR),
        new Animal("Giraffe", 7, Classification.HERBIVORE),
        new Animal("Gibbon", 35, Classification.OMNIVOROUS),
        new Animal("Horse", 36, Classification.HERBIVORE),
        new Animal("Lynx", 2, Classification.PREDATOR),
        new Animal("Dinosaur", 200, Classification.PREDATOR)
    );
  }
}
