package concurrency;

public class SecondThread implements Runnable {
  private Sequence sequence;
  private volatile boolean running = true;


  SecondThread(Sequence sequence) {
    this.sequence = sequence;
  }

  @Override
  public void run() {
    while (running) {
      System.out.println("Second thread: " + sequence.getNext());
      if (sequence.getValue() > 100) {
        running = false;
      }
    }
  }
}
