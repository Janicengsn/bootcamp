import java.math.BigDecimal;

// ! Author of Circle -> 類似模具, control the access (read/write) of the object
public class Circle {
  private double radius;
  private String color;
  // private double area; // violate OOP concept

  // Constructor (all args constructor)
  public Circle (double radius, String color) {
    this.radius = radius;
    this.color = color;
  }
  // Type of Method: Presentation - diameter
  public double diameter() {
    return BigDecimal.valueOf(this.radius) // 
    .multiply(BigDecimal.valueOf(this.radius)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }

  public String getColor() {
    return this.color;
  }

  public double getRadius() {
    return this.radius;
  }

// What is the implication of "No setter"?
// 1. We cannot modify the data of object after day1 creation.


  // Type of Method: Presentation
  public double area() {
    return BigDecimal.valueOf(this.radius) // 
    .multiply(BigDecimal.valueOf(this.radius)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }

  // static
  public static double area2(double radius){
    return BigDecimal.valueOf(radius) // 
    .multiply(BigDecimal.valueOf(radius)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }
  
  // ! The user of the Circle class -> convenient.
  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    System.out.println(c1.area()); // 3.5 * 3.5 * PI
    System.out.println(c1.color); // RED

    // c2 -> 4.5 BLUE
    Circle c2 = new Circle(4.5, "BLUE");
    System.out.println(c2.color); // BLUE

    // Circle[] -> c1, c2
    Circle[] circles = new Circle[2];
    circles[0] = c2;
    circles[1] = c1;

    // use array to find c2's color
System.out.println(circles[0].getColor()); // BLUE

    // use array to find c1's area
    System.out.println(circles[1].area()); // ~38.48

    System.out.println(c1.diameter()); // 7.0
    System.err.println(c2.diameter()); // 9.0

    //What if we don't backup the circle address
    Circle[] circles2 = new Circle[3];
    circles2[0] = new Circle(9.0, "BLACK");
    circles2[1] = new Circle(2.3, "YELLOW");
    circles2[2] = new Circle(1.9, "PINK");
    System.out.println(circles2[0].getColor()); // BLACK



    // Non-OOP
double radius = c1.getRadius();
double area = BigDecimal.valueOf(radius) //
        .multiply(BigDecimal.valueOf(radius)) //
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();
    System.out.println(area);

    System.out.println(Circle.area2(3.5));
  }
}
