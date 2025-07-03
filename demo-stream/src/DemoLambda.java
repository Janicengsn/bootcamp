// Java 8 (2014), major release for Java

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// ! Function, Predicate, Consumer
public class DemoLambda {
  public static void main(String[] args) {
    // Function
    // f(x) = y

    // Function<String, Integer> -> Input (String) -> Output (Integer)
    Function<String, Integer> stringLengthFormula = (str) -> str.length();
    System.out.println(stringLengthFormula.apply("hello")); // 5

    // ! more than 1 line of ocde, use{}
    Function<String, Boolean> searchAFunction = (str) -> {
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'A')
        return true;
      }
      return false;
    };
    System.out.println(searchAFunction.apply("Apple")); // true
    System.out.println(searchAFunction.apply("Lucas")); // false

    // BiFunction
    // 2 inputs -> 1 output
    BiFunction<String, String, String> concatFunction = (s1, s2) -> s1.concat(s2);
    System.out.println(concatFunction.apply("abc","def")); // abcdef

    // Consumer
    Consumer<String> stringPrinter = s -> System.out.println(s);
    stringPrinter.accept("hello"); // hello
    stringPrinter.accept("bootcamp"); // bootcamp

    
    BiConsumer<Double, Integer> printCheckOutAmount = (price, quantity) -> System.out.println(price * quantity);
    printCheckOutAmount.accept(3.9, 5); // 19.5

    //Supplier
    Supplier<Integer> randomNumberGenerator = () -> new Random().nextInt(49) + 1; // 1-49 // 因為冇input, 所以就咁()
    System.out.println(randomNumberGenerator.get());

    // Predicate (True/False formula) != boolean (自己定義true/false)
    boolean isAdult = true;
    Predicate<Integer> adultDefintion = age -> age >= 18;
    System.out.println(adultDefintion.test(17)); // false *Predicate 一定係.test
    System.out.println(adultDefintion.test(18)); // true

    BiPredicate<String, Integer> isNameTooLong = (name, upperLimit) -> name.length() > upperLimit;
    System.out.println(isNameTooLong.test("John", 5)); // false
    System.out.println(isNameTooLong.test("Vincent", 5)); // true

    // UnaryOperator & BinaryOperator
    BiFunction<String, String, String> replaceXXFunction = (source, from) -> source.replace(from, "XX");
    System.out.println(replaceXXFunction.apply("hello", "ll")); // heXXo

    BinaryOperator<String> replaceXXFunction2 = (source, from) -> source.replace(from, "XX");

    // for-each
    List<Dog> dogs = new ArrayList<>(Arrays.asList(new Dog("John", 10), new Dog("Peter", 4)));
    for (Dog d : dogs) {
      System.out.println(d.getName());
    }

    dogs.forEach(d -> System.out.println(d.getName()));
    dogs.forEach(d -> {
      System.out.println("Dog Info.");
      System.out.println(d.getName());
      System.out.println(d.getAge());
    });
  }

  public static class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
}
