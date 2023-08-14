package lambda;

public class CheckIfHopper implements  CheckTrait {

  // Checking can the animal hop or not:
  public boolean test(Animal a) {
    return a.canHop();
  }
}
