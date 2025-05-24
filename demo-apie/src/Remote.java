public class Remote extends Machine {
  private String color;
  
  public Remote(String color, double weight) {
    super(weight); //  refer to "Animal.java"'s constructor
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public double getWeight() {
    return super.getWeight();
  }

  
}
