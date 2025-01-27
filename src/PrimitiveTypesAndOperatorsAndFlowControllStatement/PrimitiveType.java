package PrimitiveTypesAndOperatorsAndFlowControllStatement;


/**
 * you can put smaller types into bigger types
 * eg : you can assign a byte to integer -> int = byte
 * The following table summarizes the ranges of primitive types:
 * <pre>
 * +-----------+---------------------------+--------------------------+
 * | Data Type |        Minimum            |        Maximum           |
 * +-----------+---------------------------+-----------------------   +
 * | byte      | -128                      | 127                      |
 * | short     | -32.768                   | 32.767                   |
 * | int       | -2.147.483.648            | 2.147.483.647            |
 * | long      | -9.223.372.036.854.775.808| 9.223.372.036.854.775.807|
 * | float     | 1.4E-45                   | 3.4028235E38             |
 * | double    | 4.9E-324                  | 1.7976931348623157E308   |
 * | char      | 0                         | 65.535 (Unicode)         |
 * | boolean   | true or false             | true or false            |
 * +-----------+---------------------------+--------------------------+
 * </pre>
 */
public class PrimitiveType {
    int a = 0b10101010; // binary
    short b = 052; // octal
    byte c = 42; // decimal
    long d = 0x2A;
    float e = 1.99E2F;
    double f = 1.99;
    char ch1 = '\u0041', ch2 = '\101';

    public static void main(String[] args) {
        // Byte
        System.out.println("byte:");
        System.out.println("  Min: " + Byte.MIN_VALUE);
        System.out.println("  Max: " + Byte.MAX_VALUE);
        System.out.println();

        // Short
        System.out.println("short:");
        System.out.println("  Min: " + Short.MIN_VALUE);
        System.out.println("  Max: " + Short.MAX_VALUE);
        System.out.println();

        // Integer
        System.out.println("int:");
        System.out.println("  Min: " + Integer.MIN_VALUE);
        System.out.println("  Max: " + Integer.MAX_VALUE);
        System.out.println();

        // Long
        System.out.println("long:");
        System.out.println("  Min: " + Long.MIN_VALUE);
        System.out.println("  Max: " + Long.MAX_VALUE);
        System.out.println();

        // Float
        System.out.println("float:");
        System.out.println("  Min: " + Float.MIN_VALUE);
        System.out.println("  Max: " + Float.MAX_VALUE);
        System.out.println();

        // Double
        System.out.println("double:");
        System.out.println("  Min: " + Double.MIN_VALUE);
        System.out.println("  Max: " + Double.MAX_VALUE);
        System.out.println();

        // Character
        System.out.println("char:");
        System.out.println("  Min: " + (int) Character.MIN_VALUE);
        System.out.println("  Max: " + (int) Character.MAX_VALUE);
        System.out.println();

        // Boolean
        System.out.println("boolean:");
        System.out.println("  Possible values: " + Boolean.TRUE + ", " + Boolean.FALSE);

    }
}
