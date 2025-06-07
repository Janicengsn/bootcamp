import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {
    int [] arr = new int [] {3, 7, -1, -80};
    // bubble sort (nested for loop) -> we don't use it in real life.

    Arrays.sort(arr); // 只可以正向排列
    System.out.println(Arrays.toString(arr));

    // custom ordering -> but the performance would be the "same" as Arrays.sort()
    Arrays.sort(arr, new SortedByIntegerDesc());
    System.out.println(Arrays.toString(arr));
  }
}
