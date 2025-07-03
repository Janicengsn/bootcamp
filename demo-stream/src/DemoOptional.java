public class DemoOptional {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(Arrays.asList(8, -2, 100));
    Integer result = findFirstOddNumber(integers);
    System.out.println(result); // null
  }

  // what if no odd number
  // not found -> Is NOT an exception
  // ! Java 8 has a better solution for this scenario
  public static Integer findFirstOddNumber(List<Integer> integers) {
    boolean found = false;
    for (Integer integer : integers) {
      if (integer % 2 == 1)
       return integer;
    }
    return null; // not found
  }
}
