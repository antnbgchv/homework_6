package bgchv.antn;

public class javaExercises {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //arithmetic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a + b - a / b * a + b = " + (a + b - a / b * a + b));

        //comparison and logical operators
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("(a | 5) > 12 || (a = b + 2) > 40 = " + ((a | 5) > 12 || (a = b + 2) > 40));

        //boolean
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("isTrue && isFalse = " + (isTrue && isFalse));
        System.out.println("isTrue || isFalse = " + (isTrue || isFalse));
        System.out.println("!isTrue = " + !isTrue);

        //overload
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue + 1 = " + (maxValue + 1));

        //int and double
        int intValue = 10;
        double doubleValue = 10.01;
        System.out.println("intValue + doubleValue = " + (intValue + doubleValue));
        System.out.println("intValue * doubleValue = " + (intValue * doubleValue));
        System.out.println("intValue == doubleValue = " + (intValue == doubleValue));

    }
}
