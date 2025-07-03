import java.util.concurrent.atomic.AtomicInteger;

public class Dog {
  private int x;
  // ! Soluton 2: AtomicInteger
  private AtomicInteger y = new AtomicInteger(0);

  // ! Solution 1: synchronized (for method use)
  // ! locking the method (static or instance)
  // Only one commander can ask this dog to sleep
  public synchronized void sleep() { //synchronized - 鎖住method. worker1 未完, worker2唔可以開始. 但program 會慢左; 拆左個Thread, 自然就鎖唔到
    this.x = this.x + 1; // ! read + write (2 operations)
  }

  public void eat() {
    y.getAndIncrement(); // revise itself
  }

  public int getX() {
    return this.x;
  }
  
  public int getY() {
    return this.y.get();
  }

  public static void main(String[] args) { // main thread
    Dog dog = new Dog();

    Runnable task1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        dog.sleep();
      }
    };

    // main thread
    Thread worker1 = new Thread(task1); // created thread 1
    Thread worker2 = new Thread(task1); // created thread 2

    worker1.start(); // inform worker 1 to start working
    worker2.start(); // inform worker 2 to start working

    try {
      worker1.join(); // main thread wait worker 1 here, until worker 1 completed the task.唔join, main thread會直行. 等Worker 1 返黎(唔理worker2), 直到Worker1返黎先check worker2返黎未.
      worker2.join(); // main thread wait worker 2 here, until worker 2 completed the task
    } catch(InterruptedException e) {

    }

    System.out.println(dog.getX()); // 200000


    // solution 2:
    Runnable task2 = () -> {
      for (int i = 0; i < 100_000; i++) {
        dog2.eat();
      }
    };

    // main thread
    Thread worker3 = new Thread(task1); // created thread 1
    Thread worker4 = new Thread(task1); // created thread 2

    worker3.start(); // inform worker 1 to start working
    worker4.start(); // inform worker 2 to start working

    try {
      worker3.join(); // main thread wait worker 1 here, until worker 1 completed the task.唔join, main thread會直行. 等Worker 1 返黎(唔理worker2), 直到Worker1返黎先check worker2返黎未.
      worker4.join(); // main thread wait worker 2 here, until worker 2 completed the task
    } catch(InterruptedException e) {

    }
  }
}
