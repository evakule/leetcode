package old;

public class ContainerWithMostWater11 {
  public static void main(String[] args) {
    int[] array1 = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    int[] array2 = new int[]{1, 1};
    int[] array3 = new int[]{4, 3, 2, 1, 4};
    int[] array4 = new int[]{2, 3, 4, 5, 18, 17, 6};
    System.out.println(maxArea(array4));

  }

  //my solution O(n)
  public static int maxAreaSecond(int[] height) {
    int maxArea = 0;
    int currentArea = 0;
    int startIndex = 0;
    int endIndex = height.length - 1;

    while (startIndex < endIndex) {
      currentArea = Math.min(height[startIndex], height[endIndex]) * (endIndex - startIndex);
      maxArea = Math.max(currentArea, maxArea);
      if (height[startIndex] < height[endIndex]) {
        startIndex++;
      } else {
        endIndex--;
      }
    }
    return maxArea;
  }


  //my solution - brute forcing O(n^2)
  public static int maxArea(int[] height) {
    Container container = new Container();
    int currentArea = 0;
    int length = 0;

    for (int i = 0; i < height.length; i++) {
      container.startIndex = i;
      for (int j = height.length - 1; j > 0; j--) {
        container.endIndex = j;
        if (height[container.startIndex] <= height[container.endIndex]) {
          length = j - i;
          currentArea = height[container.startIndex] * length;
          if (currentArea > container.area) {
            container.area = currentArea;
          }
          break;
        }
        else if (height[container.startIndex] >= height[container.endIndex]) {
          length = j - i;
          currentArea = height[container.endIndex] * length;
          if (currentArea > container.area) {
            container.area = currentArea;
          }
          if (j <= i) {
            break;
          }
        }
      }
    }

    return container.area;
  }
}

class Container {
  int startIndex = 0;
  int endIndex = 0;
  Integer area = 0;

  public Container() {
  }
}
