package PrimitiveTypesAndOperatorsAndFlowControllStatement;

public class Practice {
    public static void main(String[] args) {
        byte x = 2, y = 3, z = 5;

        // every arithmetic operation will result in an integer if the types are smaller than int
        z = (byte) (x + y);

        System.out.println(z);

        //in an arithmetic operation the value is casted to the bigger type
        float a = (float) x / y;

        System.out.println(a);

        double b = (double) x / y;
        System.out.println(b);
        b = a;

        System.out.println(b);

        float c = Math.round(b * 1000) / 1000f;
        System.out.println(c);


        char a1 = 'a', a2 = '\141', a3 = '\u0061';
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        int i = a1;

        System.out.println(i);
        // octal representation  - hex representation
        int i1 = 0141, i2 = 0x61;
        // when logged they will be represented in decimal format
        System.out.println(i1);
        System.out.println(i2);

        char a4 = (char) i1;
        System.out.println(a4);

        char someChar2 = 'b';
        boolean isEven2 = (someChar2 % 2 == 0);
        System.out.println(isEven2);

        char someChar = 'k';
        boolean isEven = (someChar % 2 == 0);
        System.out.println(isEven);

        // minuscule chars start from 97 and ends at 122
        char nextChar = (char) (someChar + 1);
        System.out.println(nextChar);


        char z1 = 'z';
        char afterZ = (char) (z1 + 1);
        System.out.println(afterZ);

        // max char
        int toInt = 65535;
        char lastChar = (char) toInt;
        System.out.println(lastChar);
        // if add one to the last it will start from the beginning char [0-65535]
        char nextOne = (char) (toInt + 1);
        System.out.println(nextOne);
        int gg = nextOne;
        System.out.println(gg);

        char u = 'U';
        ++u;
        System.out.println(u);
        // a - A  are seperated by 32 symbol according to ASCII  encoding
        char lowerA = 'a', upperA = 'A';

        int distance = upperA - lowerA;
        System.out.println(distance);
    }
}
