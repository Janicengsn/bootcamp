// ! Java 16 record
public record Staff(String name, int age) {
  // private String name;
  // private int age;

  // public Staff(String name, int age) {
    // this.name = name;
    // this.age = age;
  // }

  // public String getName() {
    // return this.name;
  // }

  // public int getAge() {
    // return this.age;
  // }

  // No setter

  // Scenario: Get data from database, and then send it over to your client

  // customer instance method (Presentation)
  public String nickname() {
    return "Pig " + this.name;
  }
}
