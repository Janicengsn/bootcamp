public class DemoString {
  public static void main(String[] args) {
    // String is NOT primitive, which consist of a set of char values
    String s = "John";
    String s2 = "Dear Sir,";

    // 8 Primitives -> store values ONLY
    // String -> Store value + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); //Vincent

    // Function 1: equals()
    System.out.println(s3.equals("Vincent")); // true
    System.out.println(s3.equals("vincent")); // false, as Java is case sensitive

    //Function 2: length()
    System.out.println(s3.length()); // 7

    //Function 3: charAt()
    // index start with 0
    // index range 0-6, length=7
    System.out.println(s3.charAt(2)); // 'n', the char at position 3
    //System.out.println(s3.charAt(7)); // out of range
    //System.out.println(s3.charAt(-1)); // out of range

    // Question: print the last character of s3
    s3 = "Steven";
    System.out.println(s3.charAt(5));
    // length(), charAt()
    System.out.println(s3.charAt(s3.length() -1)); // n

    // Find the middle character of name
    String name = "Joey"; // o
    // Joey -> e
    // Vincent -> c
  }
}
