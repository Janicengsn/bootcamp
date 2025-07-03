public class DemoTypeInference {

  public static void main(String[] args) {
    int x = 10;
    x = (int) 10.3; // Strong Type: Java has to explicitly convert between types

    // ! Java 10/11
    // If you use "var" as a type of variable, it implies the type of this variable would the type of value assigned at first time.
    // During compile, the compiler convert "var" to "int"
    var age = 10;
    // age = 10.5;
    // age = "hello";
  }
  
}
