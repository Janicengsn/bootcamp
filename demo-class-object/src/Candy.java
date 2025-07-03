public class Candy {
  private static int count = 20;
  private String color;
  private int number;

  public Candy(String color, int number) {
    this.color = color;
    this.number = number;
  }

  // Candy has color, number, 
  // ...

  public static void main(String[] args) {
    Candy c1 = new Candy();
    Candy c2 = new Candy();

    // Distribute 20 candy to 3 Students
    // Every Student has his own candies.
    // print out the candy (color, number) of every students

    // Use loop to distribute candy

    // Teacher.java -> distribute
    // Student (應該要有candy array) -> receive(Candy candy)


    // warrior.attack(archer)
    // public void attack (Archer archer) {
    // archer.deductHP(10);
    // }
  }
}
