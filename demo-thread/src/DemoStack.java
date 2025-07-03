import java.util.List;
import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // Queue: first in first out
    // Stack: first in last out
    Stack<String> s1 = new Stack<>();
    s1.push("John"); // push = 壓入容器頂部
    s1.push("Peter");
    s1.push("Vincent");
    System.out.println(s1.pop()); // Vincent; pop = 容器頂彈出元素
    System.out.println(s1.size()); // 2; coz already pop out Vincent, so only John and Peter left
    System.out.println(s1.pop()); // Peter
    System.out.println(s1.size()); // 1

    // undo redo
    

    // Hop Interview Question: Using 2 Stacks implement a SuperQueue (first in first out)

  }
}
