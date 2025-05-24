public class Shape {
  private static int counter = 0; // static -> 公家既意思
  private static final double PI = 3.14159; // "static final" -> constant (常數, 恆久不變)
  private final String name = "John";
  private String color; // attribute (usually we have setter, because it is not final)
  //final -> finalized

  public Shape () {

  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println(Phone.PI); // 3.14159
    // ! because Shape.PI is a "final" variable, so cannot be modified.
    // Shape.PI += 1;
    Phone.counter++;
    System.out.println(Phone.counter); // 1

    new Phone().counter++; // Not recommended
    Phone.counter++; // Normal usage
    System.out.println(Phone.counter); // 3

    // print John
    Phone s1 = new Phone();
    System.out.println(new Phone().getName()); // John
  }
}
