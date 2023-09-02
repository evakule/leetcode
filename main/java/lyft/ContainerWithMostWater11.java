package lyft;

public class ContainerWithMostWater11 {
  public static void main(String[] args) {

  }

  public static int maxArea(int[] height) {
    Container container = new Container();
    int currentVolume = 0;
    for (int i = 0; i < height.length; i++) {
      container.startIndex = 0;
      container.endIndex = i + 1;
      currentVolume = height[container.startIndex] * height[container.endIndex];
      if (currentVolume > container.volume) {
        container.volume = currentVolume;
      }
      if (currentVolume == 0) {
        container.startIndex = i + 1;
      }

    }
    return container.volume;
  }
}

class Container {
  int startIndex = 0;
  int endIndex = 0;
  Integer volume = 0;

  int firstHeight = 0;
  int lastHeight = 0;

  public Container() {
  }

//  public int calculateVolume(int[] array, int h1, int h2) {
//
//
//  }
}
