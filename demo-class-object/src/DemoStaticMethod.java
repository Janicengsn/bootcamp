public class DemoStaticMethod {
  private int age;

  public DemoStaticMethod(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  // ! Most (90%) of the instance methods are presentations
  // ! Presentation (Presenting the content of the object)
  public boolean isElderly() {
    return this.age > 65;
  }

    public boolean isChild() {
      return this.age < 18; // definition
    }
  
    // ! static method
    // 1. input (age) -> output (boolean)
    public static boolean isElderly2(int age) {
      return age > 65;
    }

    // Why it can be instance method?
    public int sum(int x, int y) {
      return x + y;
    }

  public static void main(String[] args) {
    DemoStaticMethod dsm = new DemoStaticMethod(10);
    System.out.println(dsm.getAge());
    System.out.println(dsm.isElderly()); // false
    System.out.println(dsm.isChild()); // true

    System.out.println(dsm.getAge() > 65); // false
    

    // print isElderly2
    System.out.println(DemoStaticMethod.isElderly2(66));

    System.out.println(new DemoStaticMethod(19).sum(1, 2)); // 3

  }
}
