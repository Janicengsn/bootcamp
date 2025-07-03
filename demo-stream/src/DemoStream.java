import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {

  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("ABC", 10));
    dogs.add(new Dog("DEFO", 7));
    dogs.add(new Dog("IJK", 8));

    // Prepare a new arraylist contains dogs with age >=8
  }// ! Filtering
  List<Dog> newDogs = new ArrayList<>();
  for (Dog dog : dogs) {
    if (dog.getAge() >=8) {  // if()係避開個condition既意思
        newDogs.add(dog);
    }
  }
    System.out.println(newDogs());

    // ! Filtering - Stream
    // List -> Stream
    Stream<Dog> newDogs2 = dogs.stream();
    // Use filter() in Stream<>
    // Use predicate
    Stream<Dog> newDogs3 = newDog2.filter(d -> d.getAge() >=8);
    // from Stream<Dog> to List<Dog>
    List<Dog> newDogs4 = newDogs3.collect(Collectors.toList());
    System.out.println(newDogs4); // [Dog(name=ABC, age=10), Dog(name=IJK, age=8)]

    List<Dog> newDogs5 = dogs.stream() //
    .filter(d -> d.getAge() >=8) //
    .collect(Collectors.toList());
    System.out.println(newDogs5); // [Dog(name=ABC, age=10), Dog(name=IJK, age=8)]

    // Dog name starts with "D"
    List<Dog> newDogs6 = dogs.stream().filter(d -> d.getName().startsWith("D")).collect(Collectors.toList());
    System.out.println(newDogs6);

    // name length > 3 and age < 8
    // ! filter supports AND OR
    List<Dog> newDogs7 = dogs.stream().filter(d -> d.getName().length() > 3 && getAge() < 8).collect(Collectors.toList());
    System.out.println((newDogs7)); 

    // ! Traditional way to get dog names
    // List<Dog> -> List<String> (Conversion of type)
    List<String> names = new ArrayList<>();
    for (Dog d : dogs) {
      names.add(d.getName()); 
    }
    System.out.println(names); // [ABC, DEFO, IJK]

    // ! map - Stream
    // List<Dog> -> List<String> (Conversion of type)
    List<String> name2 = dogs.stream() //
    .map(d -> d.getName()) // ! Function<Dog, String>
    .collect(Collectors.toList());
    System.out.println(names2); // [ABC, DEFO, IJK]

    // ! Stream - filter + map
    // find all dog names, whose age > 9
    List<String> names3 = dogs.stream().filter(dog -> dog.getAge() > 9).map(dog -> dog.getName()).collect(Collectors.toList());
    System.out.println(names3);

  }

  public static class Staff {

  }

  
  public static class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Dog("
      + "name=" + this.name
      + "age=" + this.age
      + ")";
    }
  }

