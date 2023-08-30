package concurrency;

public class FirstThread implements Runnable {
  private Sequence sequence;
  private volatile boolean running = true;

  FirstThread(Sequence sequence) {
    this.sequence = sequence;
  }

  @Override
  public void run() {
    while (running) {
      System.out.println("First thread: " + sequence.getNext());
      if (sequence.getValue() > 100) {
        running = false;
      }
    }
  }
}
