package patterns.two_types_of_adapters;

public class Main {
  public static void main(String[] args) {
    NewSystem newSystemInheritance = new AdapterInheritance();
    newSystemInheritance.newMethod();

    OldSystem oldSystem = new OldSystem();
    NewSystem newSystemComposition = new AdapterComposition(oldSystem);
    newSystemComposition.newMethod();
  }
}
