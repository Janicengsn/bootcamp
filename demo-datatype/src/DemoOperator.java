public class DemoOperator {
  public static void main(String[] args){
    // +, -, *, /, %
    int x = 3;
    x = 6 + 9;
    int y = 5 + x - 10;
    System.out.println(y); // 10

    // 9 * 2 first
    int a = y - 9 * 2;
    System.out.println(a); // -8

    int b = (y - 9) * 2;
    System.out.println(b); // 2

    b = ((b - 10) + 2) * 2;
    System.out.println(b); // -12

    //divided by zero
    // int r = 10 / 0; // system error

    int r2 = 0 / 10;
    System.out.println(r2);

    // Java: int / int -> int
    int r3 = 10 / 3;
    System.out.println(r3);
    System.out.println(5 / 2); // 2
    // double / int -> double / double -> double
    System.out.println(5.0 / 2); // 2.5
    System.out.println(5.0 / 2.0); // 2.5

    int score1 = 71;
    int score2 = 82;
    // code here...
    //! (int + int) / int -> int
    //! (int + int) / double -> double
    double averageScore = (score1 + score2) / 2.0;
    System.out.println(averageScore); //76.5

    //Big problem
    double d5 = 0.1 + 0.2;
    System.out.println(d5); // 0.300000000004

    double d6 = 0.2 + 0.3;
    System.out.println(d6); // 0.5

    //! remainder of 10 / 3
    int r8 = 10 % 3;
    System.out.println(r8); // 1

    int johnAge = 64;
    boolean isElderly = johnAge >= 65; // formula / definition
    System.out.println(isElderly);

    //boolean isMale = false;
    //boolean: issth or shouldsth

    // + 1 and - 1
    int t = 0;
    t++; //自己跳, 加一
    ++t; // 自己加二
    t = t + 1;
    //! "= t +" -> "+="
    t += 1;
    System.out.println(t); // 4

    int w = 0;
    w--;
    --w;
    w = w - 1;//由右睇到左, 即將W-1寫入"W="
    w -= 1;
    System.out.println(w); // -4

    // +/- non 1 value
    int o = 3;
    o -= 4;
    o += 4;
    System.out.println(o); // 3

    int q = 3;
    q = q * 3;
    q *= 3;
    System.out.println(q); // 27

    int v = 27;
    v /=3;
    v = v / 3;
    System.out.println(v); // 3

    // comparison
    // >, <, >=, <=, ==, !=(不等於)
    int score = 91;
    boolean isGreatA = score >= 90;
    System.out.println(isGreatA); // true

    char gender = 'F';
    boolean isFemale = gender != 'M';
    System.out.println(isFemale); // true
  }
}
