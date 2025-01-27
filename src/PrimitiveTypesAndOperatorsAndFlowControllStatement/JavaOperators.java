package PrimitiveTypesAndOperatorsAndFlowControllStatement;

/**
 * A utility class to demonstrate assignments, arithmetic operations, and compound assignments in Java.
 */
public class JavaOperators {

    /**
     * Demonstrates simple assignments and arithmetic operations.
     */
    static void AssignmentsAndArithmetics() {
        System.out.println("Assignments and Arithmetic Operations:");

        int a = 1;
        System.out.println("int a = 1; // a = " + a);

        int b = a + 4;
        System.out.println("int b = a + 4; // b = " + b);

        int c = b - 2;
        System.out.println("int c = b - 2; // c = " + c);

        int d = c * b;
        System.out.println("int d = c * b; // d = " + d);

        int e = d / c;
        System.out.println("int e = d / c; // e = " + e);

        int f = d % 6;
        System.out.println("int f = d % 6; // f = " + f);

        System.out.println();
    }

    /**
     * Demonstrates compound assignment operations.
     */
    static void CompoundAssignment() {
        System.out.println("Compound Assignment Operations:");

        int a = 1, b = 3;
        System.out.println("int a = 1, b = 3; // a = " + a + ", b = " + b);

        a += b;
        System.out.println("a += b; // a = " + a);

        a -= 2;
        System.out.println("a -= 2; // a = " + a);

        a *= b;
        System.out.println("a *= b; // a = " + a);

        a /= 2;
        System.out.println("a /= 2; // a = " + a);

        a %= a;
        System.out.println("a %= a; // a = " + a);

        System.out.println();
    }

    /**
     * Demonstrates overflow and underflow behavior in Java for various data types.
     */
    static void TypesOverAndUnderFlowing() {
        System.out.println("Types Overflowing Operations:");

        // Overflow with byte (Range: -128 to 127)
        byte a = 127;
        a++;
        System.out.println("byte a = 127; a++; // a = " + a + " (Overflow: wraps to -128)");

        // Underflow with byte
        byte b = -128;
        b--;
        System.out.println("byte b = -128; b--; // b = " + b + " (Underflow: wraps to 127)");

        // Overflow with short (Range: -32,768 to 32,767)
        short c = 32_767;
        c++;
        System.out.println("short c = 32_767; c++; // c = " + c + " (Overflow: wraps to -32,768)");

        // Underflow with short
        short d = -32_768;
        d--;
        System.out.println("short d = -32_768; d--; // d = " + d + " (Underflow: wraps to 32,767)");

        // Overflow with int (Range: -2,147,483,648 to 2,147,483,647)
        int e = 2_147_483_647;
        e++;
        System.out.println("int e = 2_147_483_647; e++; // e = " + e + " (Overflow: wraps to -2,147,483,648)");

        // Underflow with int
        int f = -2_147_483_648;
        f--;
        System.out.println("int f = -2_147_483_648; f--; // f = " + f + " (Underflow: wraps to 2,147,483,647)");

        // Overflow with long (Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long g = 9_223_372_036_854_775_807L;
        g++;
        System.out.println("long g = 9_223_372_036_854_775_807; g++; // g = " + g + " (Overflow: wraps to -9,223,372,036,854,775,808)");

        // Underflow with long
        long h = -9_223_372_036_854_775_808L;
        h--;
        System.out.println("long h = -9_223_372_036_854_775_808; h--; // h = " + h + " (Underflow: wraps to 9,223,372,036,854,775,807)");

        // Overflow with float (Not exact due to floating-point representation)
        float i = Float.MAX_VALUE;
        i *= 2;
        System.out.println("float i = Float.MAX_VALUE; i *= 2; // i = " + i + " (Infinity: overflowed beyond the maximum)");

        // Underflow with float
        float j = Float.MIN_VALUE;
        j /= 2;
        System.out.println("float j = Float.MIN_VALUE; j /= 2; // j = " + j + " (Underflow: too small to represent)");

        // Overflow with double
        double k = Double.MAX_VALUE;
        k *= 2;
        System.out.println("double k = Double.MAX_VALUE; k *= 2; // k = " + k + " (Infinity: overflowed beyond the maximum)");

        // Underflow with double
        double l = Double.MIN_VALUE;
        l /= 2;
        System.out.println("double l = Double.MIN_VALUE; l /= 2; // l = " + l + " (Underflow: too small to represent)");

        System.out.println();
    }
    /**
     * Main method to run the examples.
     *
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {
        // Demonstrate simple assignments and arithmetic operations
        AssignmentsAndArithmetics();

        // Demonstrate compound assignments
        CompoundAssignment();

        // Demonstrate overflow and underflow in primitive types
        TypesOverAndUnderFlowing();
    }
}
