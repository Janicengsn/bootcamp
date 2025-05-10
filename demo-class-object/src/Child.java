public class Child {
  // ! static -> common attribute, NOT belongs to any object
  // ! but all objects can access the static variable
  private static int counter = 0;

  // Every Child object has id, firstName and lastName. But no counter.
  // Attribute (Instance variable)
  // Instance = object
  private long id;
  private String firstName;
  private String lastName;

  //constructor
  public Child (String firstName, String lastName){
    counter++;
    this.id = counter;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  // getter
  public long getId() {
    return this.id;
  }

  public String getFirstName() {
  return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  // ! Rewrite the definition of Child in your world.
  public boolean equals(Child child) {
    //return this.firstName.equals(child.getFirstName()) && this.lastName.equals(child.getLastName());
   return this.id == child.getId();
  }

  

public static void main(String[] args) {
  Child c1 = new Child ("Leo", "Chan");

  //Apprach 1
  if (c1.getFirstName().equals("Leo") && c1.getLastName().equals("Chan")) {
    System.out.println("He is Leo Chan.");
  }

  //Approach 2
  System.out.println(c1.equals(new Child("Leo", "Chan"))); // true
  System.out.println(c1.equals(new Child("Leo", "Lau"))); // false
  System.out.println(c1.equals(new Child("Peter", "Lau"))); // false
  System.out.println(c1.equals(new Child("Peter", "Chan"))); // false

  Child c2 = new Child("Leo", "Wong");
  System.out.println(c2.getId()); // 6
  System.out.println(c2.equals(new Child("Leo", "Wong")));
}



}
