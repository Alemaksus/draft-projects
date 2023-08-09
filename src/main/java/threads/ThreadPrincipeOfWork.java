package threads;

public class ThreadPrincipeOfWork {

  public static void main(String[] args) {

    Thread thread1 = new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        System.out.println("Thread 1: " + i);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        System.out.println("Thread 2: " + i);
        try {
          Thread.sleep(
              200); //different sleep pause in order to see the difference in execution of both threads
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    thread1.start();
    thread2.start();

  }
}
