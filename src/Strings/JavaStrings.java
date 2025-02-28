package Strings;


public class JavaStrings {
    public static void main(String[] args) {
        // string in java are immmutable , the jvm create a pool of strings when we create one it check if the string already exsist in the pool if yes it point to it
        String s = "Text";
        // s2 will not create a new obj in the heap but rather it will point on obj s
        String s2 = "Text";

        System.out.println("equal : " + (s == s2));

        // using new keyword we create a new object
        String s3 = new String("Text");
        // new obj
        String s4 = new String("Text");
        System.out.println("equal : " + (s3 == s4));

        //it takes the least indentation and shift to the left
        String textBlock = """
                    hello
                  world from other
                 side
                """;

        System.out.println(textBlock);


        // StringBuilder are mutable u can modify the same obj with woring about memory
        StringBuilder sb = new StringBuilder(textBlock);
         sb.append("Earth");
         sb.append(2);
         sb.append('C');
        System.out.println(sb);

        // one of the way to format
        String p2 = "product: %d, %s, price: %2.2f";
        System.out.println(p2.formatted(100,"frommage",1.255));
        System.out.format(p2,100,"frommage",1.255);
        System.out.printf(p2,100,"frommage",1.255);
    }
}
