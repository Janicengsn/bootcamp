public class Dog {
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // ! you should override equals(), 
  // ! so that list.remove() able to remove the same dog (your definition)

}
