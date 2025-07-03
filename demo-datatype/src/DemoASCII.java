public class DemoASCII {
  public static void main(String[] args) {
    // convert char to int
    char c = 'a'; // 97 in ascii
    int x = c; // safe
    System.out.println(x); // 97

    int y = 65;
    //char c2 = y; // unsafe; during compile time, variable y is int range.
    // convert from int to char is un-safe
    char c2 = (char) y; // 強行convert
    System.out.println(c2); // 'A'

    System.out.println((char) 48); // '0'

    // ! char 0-65535
    System.out.println((char) 65610); // 'J' (ASCII: 74) -> 兜左一圈

    int x1 = 128;
    byte b1 = (byte) x1;
    System.out.println(b1); // -128

    // byte -> short -> int -> long -> float -> double (升級, 安全)
    // char -> int -> long -> float -> double (降級, unsafe)
    float f1 = 10L;
    System.out.println(f1); // 10.0
    double d1 = 100.25f;
    System.out.println(d1); // 100.25

    long l2 = (long) 10.9f;
    System.out.println(l2); // 10

        int x8 = 33000;
    short s3 = (short) x8;
    System.out.println(s3); // -32536




  }
  
}
