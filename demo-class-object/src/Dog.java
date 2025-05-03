public class Dog {

  private String name;
  private String color;
  private String breed;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
    }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }
  
  public String getBreed() {
    return this.breed;
  }
  
public static void main(String[] args) {
  String dogd1Name = "Giggle";
  String dogd1Color = "White and Brown";
  String dogd1breed = "Beagle";

  String dogd2Name = "Poppy";
  String dogd2Color = "Black";
  String dogd2breed = "Labrador";

  Dog d1 = new Dog();
  d1.setName("Giggle");
  System.out.println(d1.getName());

  Dog d2 = new Dog();
  d2.setColor("Black");
  System.out.println(d2.getColor());

  Dog d1 = new Dog(); //! Why unable to generate data? coz set d1 already?
  d1.setColor("White and Brown");
  System.out.println(d1.getColor());


  d1.setBreed("Beagle");
  System.out.println(d1.getBreed());

  
}  
}
