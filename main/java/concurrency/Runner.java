package concurrency;


public class Runner {
  public static void main(String[] args) throws InterruptedException {
    Sequence sequence = new Sequence(1);
    FirstThread firstThread = new FirstThread(sequence);
    SecondThread secondThread = new SecondThread(sequence);

    long before1 = System.currentTimeMillis();
    new Thread(firstThread).start();
    new Thread(secondThread).start();
    long after1 = System.currentTimeMillis();
    Thread.sleep(2000L);

//    Sequence sequence2 = new Sequence(1);
//    long before2 = System.currentTimeMillis();
//    for (int i = 0; i < 10000; i++) {
//      System.out.println(sequence2.getNext());
//    }
//    long after2 = System.currentTimeMillis();
    System.out.println("Time1: " + (after1 - before1));
    System.out.println("Before1: " + before1);
    System.out.println("After1: " + after1);
    System.out.println();
//    System.out.println("Time2: " + (after2 - before2));
//    System.out.println("Before2: " + before2);
//    System.out.println("After2: " + after2);
  }
}
