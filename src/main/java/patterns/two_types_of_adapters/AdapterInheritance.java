package patterns.two_types_of_adapters;

class AdapterInheritance extends OldSystem implements NewSystem {
  @Override
  public void newMethod() {
    oldMethod();
  }
}
