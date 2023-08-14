package lambda;

import javax.lang.model.element.AnnotationMirror;

public class Animal {

  // All fields are private and can be accessed via the public methods:
  private String species;
  boolean canHop;
  boolean canSwim;

  public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
  }

  public boolean canHop() {
    return canHop;
  }

  public boolean canSwim() {
    return canSwim;
  }

  public String toString() {
    return species;
  }
}
