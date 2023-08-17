package patterns.Facade;

/*The Facade pattern provides
 a simplified interface to a complex system or set of subsystems.
 It does not add new features, but makes the system easier to use.*/


import patterns.Facade.Computers.CPU;
import patterns.Facade.Computers.HardDrive;
import patterns.Facade.Computers.Memory;

public class ComputerFacade {

  CPU cpu;
  Memory memory;
  HardDrive hardDrive;

  ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
    this.cpu = cpu;
    this.memory = memory;
    this.hardDrive = hardDrive;
  }

  void start() {
    hardDrive.read();
    memory.load();
    cpu.execute();
  }

}
