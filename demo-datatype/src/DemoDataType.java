public class DemoDataType {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // ! DataType: Primitives
        // ! 1. Store Integer: byte, short, int, ong
        // ! 2. Store Number with Decimal Place: float, double
        // ! 3. Store Single Character: char
        // ! 4. Store True or False: boolean


        int x = 3;
        int y = 7;
        System.out.println(x);
        System.out.println(y);

        x = 10;
        System.out.println(x);

        y = 100;
        System.out.println(y);

        // ! double 
        double d1 = 4.4;
        System.out.println(d1);

        double d2;
        d2 = 5.999;
        System.out.println(d2);

        // +, -, *, /
        int x2 = 6 + 1;
        System.out.println(x2);

        int x3 = 9;
        x2 = x3;
        System.out.println(x2);
        System.out.println(x3);

        int x4 = 10;
        x2 = 7 + x4;
        System.out.println(x2);

        //! add 3 to itelf
        x2 = x2 + 8;
        System.out.println(x2);

        // byte, short, int, long (Store Integer)
        byte b1 = 3;
        short s1 = 3;
        int i1 = 3;
        long l1 = 3;

        // byte (-128 - 127)
        // short (-32xxx - 32xxx)
        // int (-2.1b - 2.1b.x)
        // long (2^63)

        b1 = -128;
        // b1 = 128;
        s1 = 32767;
        // s1 = 32768;

        i1 = 2_147_483_647;
        //! in java world, "_" will replace ","
        i1 = i1 + 1;
        System.out.println(i1); // -2147483648 (overflow)
        // exceed limit, then will返轉頭, 行到盡頭就返轉頭

        // you intend to write int value 2200000000(22億) into a long variable
        // 1. Prepare an long value 22億
        // 2. Assign a value into long variable (left hand side)
        // l1 = 2_200_000_000; //! system error (You cannot prepare an int value 22億)
        // ==> in the order words, without "L", = int
        l1 = 2_200_000_000L;
        l1 = l1 + 3L;
        System.out.println(l1);
        l1 = l1 + 2_200_000_000L;
        System.out.println(l1);

        // long + int -> long + long -> long
        long l2 = 2_200_000_000L + 5;
        System.out.println(l2);

        // 
        int i8 = 9;
        // what is the type of i8? ooo... it is int, sorry NOT OK.
        // byte b9 = i8; // int value -> unsafe.

        byte b10 = 3; // direct value -> safe.
        // short s11 = i8; // unsafe.

        // ! the range of int value should solve the majority of the problem in system.
        // so we won't use long as as default type of variable for storing integer.

        // boolean (either true or false)
        boolean b9 = true;
        b9 = false;

        int result = 10;
        // "result % 2 == 1" -> true
        boolean isResultOddNumber = result % 2 == 1; //! "=="-> checking if equals to
        System.out.println(isResultOddNumber); //false

        // char
        // single quote
        // assign char value 'a' into char variable
        char c1 = 'a';
        System.out.println(c1); //a
        c1 = '$';
        c1 = '+';
        c1 = 'a';
        char c2 = 'A';
        System.out.println(c1 == c2); //! false, becoz Java is case sensitive

        char lastName = '陳';
        System.out.println(lastName);
        // we cannot assign a bigger range of variable to smaller range of variable (by default)
        byte b40 = (byte) 128L; //"()" -> Force assignment
        System.out.println(b40); // -127

        // float (store decimal number)
        //!3.14159 is double value. double which contain more digit than float
        //so unsafe (assign double value to float variable)
        float f1 = 3.14159f;

        //problem
        f1 = 0.3f + 0.4f;
        System.out.println(f1); // 0.70000005
    }
}
