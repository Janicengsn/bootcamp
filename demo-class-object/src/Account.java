public class Account {
  // Attributes
  private String userId;
  private double balance; // defalut value -> 0.0

  // ! Can be more than 1 constructors
  // Constructor -> DO NOT have return type
  public Account() { // empty constructor (no parameter)
    // empty constructor implicitly exists (When there is no constructor)
    this.balance = 10.0;
  }

  // Technically OK
  // public Account(String userId) {
  //  this.userId = userId;
  // }

  // All arguments constructor (All parameters)
  public Account(String userId, double balance) {
    this.userId = userId;
    this.balance = balance;
  }

  public String getUserId() {
    return this.userId;
  }

    public void setUserId(String userId) {
      this.userId = userId;
  }


  // ! write
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // ! read
  public double getBalance() {
    return this.balance;
  }

  public static void main(String[] args) {
    // object reference: a1, a2
    // "new" -> create an object of Account
    Account a1 = new Account();
    a1.setBalance(100.0);
    System.out.println(a1.getBalance()); // 100.0



    Account a2 = new Account();
    a2.setBalance(200.0);
    System.out.println(a2.getBalance()); // 200.0

    a2 = a1;
    a2.setBalance(500.0);
    System.out.println(a1.getBalance()); // 500.0
    System.out.println(a2.getBalance()); // 500.0

    Account a3 = new Account("johnwong", 900.0);
    System.out.println(a3.getBalance()); // 900.0

    // Local Variable
    String userId = "123";
    System.out.println(userId);

    Account[] accounts = new Account[3]; // create Account Array Object
    Account a1 = new Account();
    Account a2 = new Account();
    a2.setBalance(800.0);
    Account a3 = new Account();
    // accounts[0] = a1;
    accounts[1] = a2;
    // accounts[2] = a3;

    System.out.println(account[1].getBalance()); // 800.0
    System.out.println(account[0].getBalance()); // ! why not 0.0?

    String[] names = new String[3];
    String s1 = "John";
    String s2 = "Peter";
    String s3 = "Sally";
    names[0] = s1;
    // names[1] = s2;

    System.out.println(names[0].length()); // 4
    // System.out.println(names[1].length()); // error
  }
}
