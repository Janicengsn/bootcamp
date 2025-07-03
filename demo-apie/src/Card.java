import java.util.Objects;

public class Card {
  private char rank;
  private char suit; // suit.class

  private Card(char rank, chat suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public char getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
  }

  // ! Override false -> true
  @Override
  public boolean equals(Object obj) {
    // Part 1: check address first
    if (this == obj)
      return true;
    // Part 2: check if Card object
    if (!(obj instanceof Card))
      return false;
    // Part 3:
    Card card = (Card) obj;
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit); // 放想distinguish 既items係()
  }

  @Override
  public String toString() {
    return "Card("
        + "rank=" + this.rank
        + ",suit=" + this.suit
        + ")";
  }

  // ACE Diamond vs King Diamond -> 1
  // Kind Diamond vs ACE Diamond -> -1
  public int compareTo(Card card) {
    // rank
    if (this.rank == card.getRank()) {
      if
        
      }
    
    return 1;
    // Spade > Heart > Club -> Diamond
}

  public static int compareTo(char suit1, char suit2) {
    if (suit1 == suit2)
      return 0;
    if (suit1 == 'S')
      return -1;
    if (suit2 == 'S')
      return 1;
    if (suit1 == 'H')
      return -1;
    if (suit2 == 'H')
      return 1;
    if (suit1 == 'C')
      return -1;
    if (suit2 == 'C')
      return 1;
  }
}
