public class Dog2 extends Animal {
  //int weight
  // int age

  private double weight;

public Dog2 (double weight, int age) {
  super(age);
  this.weight = weight;
}

public double getWeight() {
  return this.weight;
}

// public int getAge() {
  // return super.getAge(); -->唔寫等於寫左? 
// }

@Override
public int getAge() {
  return super.getAge() + 10;
}





public static void main(String[] args) {
  Dog2 dog = new Dog2(9.9, 13);
  System.out.println(dog.getAge()); // 13
  System.out.println(dog.getWeight()); // 9.9
}




}
