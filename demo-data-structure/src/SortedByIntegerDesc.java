// formula
import java.util.Comparator;

public class SortedByIntegerDesc implements Comparator<Integer> {
  // if return -1, means i1 goes first
  // if return 1, means i2 goes first

  //由大至細
  @Override
  public int compare(Integer i1, Integer i2) {
    if (i1 > i2)
    return -1;
    return 1; // 死記 
  }
}
