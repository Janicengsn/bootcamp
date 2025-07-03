public enum Suit {
  DIAMOND(1), CLUB(2), HEART(3), SPADE(4),;

  private int value;

  private Suit(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // public int compareTo(Suit suit) {
    // if (this == suit)
    // return 0;
    // if (this.getValue() > suit.getValue())
    // return -1;
    // return 1;
  //}


  public static void main(String[] args) {
    // enum compareTo -> ordering.
    System.out.println(Suit.HEART.compareTo(Suit.DIAMOND)); // 2 (3-1)
  }
}
