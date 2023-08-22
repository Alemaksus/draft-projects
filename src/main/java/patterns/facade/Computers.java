package patterns.facade;

public class Computers {

  static class CPU {
    void execute() {
      System.out.println("Выполнение команды");
    }
  }

  static class Memory {
    void load() {
      System.out.println("Загрузка в память");
    }
  }

  static class HardDrive {
    void read() {
      System.out.println("Чтение с жесткого диска");
    }
  }

}
