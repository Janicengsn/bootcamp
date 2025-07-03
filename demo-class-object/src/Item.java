public class Item {
  private double price;
  private int quantity;

  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  //BigDecimal
  public double subtotal() {
    return this.price * this.quantity;
  }

  // setter -> setQuantity()

  // ! The ways of access the object's content
  public void add() {
    this.quantity++;
  }

  public boolean deduct() {
    if (this.quantity > 0){
      this.quantity--;
      return true;
    }
    return false;
  }

  public int getQuatity() {
    return this.quantity;
  }

  public static void main(String[] args) {
    Item itemA = new Item(99.0, 1);
    itemA.add();
    itemA.add();
    itemA.deduct();
    System.out.println(itemA.getQuatity()); // 2
  }
}
