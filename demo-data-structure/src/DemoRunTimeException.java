public class DemoRunTimeException {
  public static void main(String[] args) {
    // ! 1. NullPointerException (NPE)
    String userInput = "hello";
    if (userInput != null) { // avoidable program issue.
    getStringLenght(userInput);
  }

  // ! 2. 
   int[] arr = new int[] {3, 8, -1};
   for (int i = 0; i < arr.length; i++) { //avoidable program issue (java.lang.ArrayIndexOutOfBound)
    System.out.println(arr[i]); // 3, 8, -1
   }

   // StringIndexOutOfBound (s.charAt(3)), which is avoidable

   // Unavoidable + foreseeable Exception
   String number = "13";
   try{
    Integer converted = Integer.parseInt(number); // java.lang.NumberFormatException
    System.out.println(converted); 
   } catch (NumberFormatException ex) { // catch the issue.
      System.out.println("Goodbye.");
   }

   // try + catch -> normal flow + exception flow (line 19 -> line 22, skip line 20)
   // if + else -> either if or else program flow

   // wrong handling for NPE, because if + else is able to hand NPE
   try {
    String s2 = null;
    s2.length();
   } catch (NullPointerException ex) {
    System.out.println("Goodbye.");
   }
    
   // divided by 0
   double averageScore = (3 + 8 + 10) / 3.0;

   int quantity = 0;
   averageScore = (3 + 8 + 10) / quantity;


   }

  public static int getStringLenght(String s) {
    return s.length();
  }
}
