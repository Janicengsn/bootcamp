public class DemoWhileLoop {
  public static void main(String[] args) {
    // Alternative - for loop
    // int i = 0; // ! DON'T use i,j,k as local variable name in any method

    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
    }

    int count = 5; // while loop -> modifier要放出面
    while (count > 0) { // 5,4,3,2,1
      System.out.println("hello");
      count--;
    }

        // ! Difference
        // 1. While loop: flexible for modifiers (conditional); For loop: standard writing code style for modifiers
        // 2. While loop: flexible for break;
  }
}
