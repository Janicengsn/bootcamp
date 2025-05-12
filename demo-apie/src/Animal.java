// Inherit
public class Animal { // Parent Class
  private int age;

  public Animal(int age) {
    this.age = age;
  }

  
  

  public static void main(String[] args) {
    Animal animal = new Animal(13);
    Cat cat = new Cat(17);
  }
}
