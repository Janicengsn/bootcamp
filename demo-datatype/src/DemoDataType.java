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

    }
}
