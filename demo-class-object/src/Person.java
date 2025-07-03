import java.math.BigDecimal;

public class Person {
  // height, weight
  private double height; // meter
  private double weight; // kg

  // ! methods:
  // BMI -> double
  public Person(double height, double weight) {
    this.height = height; 
    this.weight = weight; 
  }

  public void exercise() {
    this.weight-= 0.1;
  }


  // ! method:
  // BMI -> double
  public double bmi() {
    BigDecimal result = BigDecimal.valueOf(height).multiply(BigDecimal.valueOf(height));
    return BigDecimal.valueOf(weight).divide(result, 2, RoundMode.HALF_DOWN).doubleValue();
  }

  // isOVerweight -> boolean (bmi >25)
  public boolean isOverweight() {
    return this.bmi() > 25;
  }
  // main
  // person[] -> p1, p2, p3
  // array -> print out their BMI and weight status
  // for loop () -> array -> print out their BMI and weight status

  public static void main(String[] args) {
    Person p1 = new Person(1.76, 80);
    Person p2 = new Person(1.5, 50.5);
    Person p3 = new Person(1.95, 90);
    System.out.println(p1.bmi()); // 25.83
    System.out.println(p1.isOverweight()); //true

    System.out.println(p2.bmi()); // 22.44
    System.out.println(p2.isOverweight()); // false

    Person[] persons = new Person[3];
    persons[0] = p1;
    persons[1] = p2;
    persons[2] = p3;

    for (int i = 0; i < persons.length; i++){
      System.out.println(persons[i].bmi() + "," + persons[i].isOverweight());
    }
  }
}
