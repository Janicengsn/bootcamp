public class Exercise {
  public static void main(String[] args) {
  // 1. equals ()
  String str1 = "hello";
  String str2 = "hello";
  String str3 = "hello world";

  System.out.println(str1.equals(str2));
  System.out.println(str1 == str2);
  System.out.println(str2.equals(str3));
  System.out.println(str2 == str3);
}
}