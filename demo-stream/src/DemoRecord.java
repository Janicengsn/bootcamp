import DemoStream.Staff;

public class DemoRecord {
   
  public static void main(String[] args) {
    Staff staff1 = new Staff("John", 25);
    // Staff staff2 = new Staff(); // The constructor Staff() is undefined

    // Getter
    System.out.println(staff1.age()); // 25
    System.out.println(staff1.name()); // John

    // equals()
    Staff staff2 = new Staff("John", 25);
    System.out.println(staff1.equals(staff2)); // true

    // hashCode()
    System.out.println(staff1.hashCode());

    // toString()
  }
}
