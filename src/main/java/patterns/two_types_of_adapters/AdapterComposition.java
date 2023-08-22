package patterns.two_types_of_adapters;

class AdapterComposition implements NewSystem {
  private OldSystem oldSystem;

  AdapterComposition(OldSystem oldSystem) {
    this.oldSystem = oldSystem;
  }

  @Override
  public void newMethod() {
    oldSystem.oldMethod();
  }
}
