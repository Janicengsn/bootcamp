// ! enum -> 有限數, 唔會成日改. Class 既升級
// For example: Color, 職業, gender, 平時填form 有得揀既option, currency, season
// ! When you execute the main method, Java main mathod create enum objects (Color.RED, Color.BLUE) for you automatically
// RED and BLUE are 2 different and globally unique objects

// ! 1. Finite number of values
// ! 2. Not usually changes (add/remove) -> program change
// ! 3. 可帶一個value
public enum Color {
  // private String value; // RED, BLUE, ...
  RED,BLUE,;

  // public Color(String value) {
    // this.value = value;
  //}

  public static void main(String[] args) {
    // System.out.println(new Color("RED"));
    // System.out.println(new Color("RED"));
    System.out.println(Color.BLUE );
  }
}
