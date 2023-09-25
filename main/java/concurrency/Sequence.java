package concurrency;


public class Sequence {
  private int value;

  public Sequence(int value) {
    this.value = value;
  }

  public synchronized int getNext() {
    return value++;
  }

  public int getValue() {
    return value;
  }
}
