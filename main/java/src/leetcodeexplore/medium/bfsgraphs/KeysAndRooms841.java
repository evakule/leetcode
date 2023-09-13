package src.leetcodeexplore.medium.bfsgraphs;

import java.util.*;

public class KeysAndRooms841 {
  public static void main(String[] args) {

  }

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] seen = new boolean[rooms.size()];
    seen[0] = true;
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);

    while (!queue.isEmpty()) {
      int roomNumber = queue.poll();
      for (int room: rooms.get(roomNumber))
        if (!seen[room]) {
          seen[room] = true;
          queue.add(room); //important: we are adding room to queue
        }
    }

    for (boolean v: seen)
      if (!v) return false;
    return true;
  }



}
