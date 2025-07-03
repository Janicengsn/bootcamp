public class DemoIf {
  public static void main(String[] args) {
    int x = 15;

    if (x < 4) {
      System.out.println("hello");
    }

    if (x < 10) {
      System.out.println("goodbye");
    } else {
      System.out.println("welcome");
    }

    // ! Rules:
    // Step 1: try "if" condition, if it is true, execute the action, and then EXIT.
    // Step 2: if the Step 1 result is false, then "else if" condition, if it is
    // true, execute the action, and then EXIT.
    // Step 3: if step result is false, then goes to "else", execute the action.

    // if + else if + else
    int y = 100;

    if (y < 90) {
      System.out.println("y is smaller than 90.");
    } else if (y >= 90 && y < 100) {
      System.out.println("y is 90 < y 99");
    } else { // y >= 100}
      System.out.println("y >= 100");
    }

    // double w
    // if w < 100, print "ABC"
    // w between 103 and 110, print "DEF"
    // for other values, print "XYZ"

    int w = 40;
    if (w < 100) {
      System.out.println("ABC");
    } else if (w >= 103 && w <= 110) {
      System.out.println("DEF");
    } else {
      System.out.println("XYZ");
    }

    // AND &&
    // OR ||
    int a = 3;
    int b = 15;
    if (a > 3 || b < 15) {
      System.out.println("a > 3 OR b < 15.");
    } else {
      System.out.println("Error"); // print
    }

    int q = 4;
    int u = 80;
    if (q > 2) {
      u = u + 2; // execute
    } else if (q < 5) {
      u = u + 10; // not execute
    }
    System.out.println(u); // 82

    q = 10;
    u = 100;
    if (q > 5 && u < 99) {
      System.out.println("hello");
    } else if (q <= 5) {
      System.out.println("bye");
    } else { // q > 5 && u >= 99
      System.out.println("bootcamp");
    }

    // String
    String s1 = "hel";
    System.out.println(s1.length()); // 3

    if (s1.length() > 3) {
      System.out.println("Java");
    } else {
      System.out.println("Phython");
    }

    // equals() + if // equals check是否等於true既過程
    String s2 = "Javascript";
    int score = 0;
    if (s2.equals("Java")) {
      score += 1;
    } else {
      score += 2;
    }
    System.out.println(score); // 2

    // charAt
    // Check if the first character of string is 'c' or the last character is 'd',
    // if yes, print "yes", if no, print "no"

    String s3 = "chain";
    if (s3.charAt(0) == 'c') {
      System.out.println("yes");
    } else {
      System.out.println("no");
      // You cannot use switch to handle the above scenario.
    }

    String s4 = "hello world";
    if (s4.charAt(0) == 'c' || s4.charAt(s4.length() - 1) == 'd') {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    // switch
    char grade = 'B';
    if (grade == 'A') {
      System.out.println("Grade is A");
    } else if (grade == 'B') {
      System.out.println("Grade is B"); // print
    } else if (grade == 'C') {
      System.out.println("Grade is C");
    } else {
      System.out.println("Fail.");
    }
    // Alternative
    // ! 1. You should use "break" for all cases in switch statement
    // ! 2. switch CANNOT check the range of the value
    switch (grade) {
      case 'A':
        System.out.println("Grade is A");
        break;
      case 'B':
        System.out.println("Grade is B"); // print
        break;
      case 'C':
        System.out.println("Grade is C");
        break;
      default:
        System.out.println("Fail");
    }
    System.out.println("helllo");
    score = 85;
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80 && score < 90) {
      grade = 'B';
    } else if (score >= 70 && score < 80) {
      grade = 'C';
    } else {
      grade = 'F';
    }


    
    
  }
}
