public class Student {
  private static int ID = 0;
  private int id;
  private Candy[] candies;

  public Student() {
    this.id = ++counter;
    this.candies = new Candy[0];
  }

  public Candy[] getCandies(){
    return this.candies;
  }

  // Presentation
  public int getTotalNumbers() {
    int sum = 0;
    for (int i = 0; i < this.candies.length, i++) {
      sum += this.candies[i].getNumber();
    }
    return sum;
  }

  //Presentation
  public int numberOfRED() {
    int count = 0;
    for (int i = 0; i < this.candies.length;)


  }
  public void receive(Candy candy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = candy;
    this.candies = newCandies;
  }
}
