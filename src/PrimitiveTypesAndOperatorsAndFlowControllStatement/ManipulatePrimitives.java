package PrimitiveTypesAndOperatorsAndFlowControllStatement;

import java.util.List;
import java.util.stream.Stream;

public class ManipulatePrimitives {
    //the distance between lower and upper characters in ascii encoding is 32
    public static void main(String[] args) {
        char upperChar = 'A';
        char lowerChar = 'a';

        int distance = upperChar - lowerChar;

        System.out.println("Result of distance between A-a in ascii is : " + distance);

        System.out.println("b to upper case : " + charToUpperCase('b'));

        System.out.println("char value 'A' in decimal is : " + (int) upperChar);
        System.out.println("char value 'a' in decimal is : " + (int) lowerChar);


        float a = 10f;
        float b = 0.05f;

        a += a * b;
        System.out.println("a += a *b -> " + a);


        List<Integer> list = Stream.of(12, 6, 3, 5, 4, 8).filter(i -> i % 2 == 0).map(i -> i * 2)
                .sorted((a1, b1) -> b1 - a1).limit(2).toList();
        System.out.println(list);
    }

    public static char charToUpperCase(char ch) {
        return (char) (ch - 32);
    }
}
