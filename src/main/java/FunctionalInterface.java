import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {
        /**
         * Predicates are Boolean valued functions of one argument meaning they take in one argument,
         * use a test method to evaluate it and return either true or false.
         */

        Predicate<String> stringLen = (s)-> s.length() < 10;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");

        /**
         * Consumer interface consumes the argument.
         * It accepts a single argument and does not return a result.
         */
        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("ABCDefghijklmnopQRSTuvWxyZ");

        /**
         * Function which transforms a value from one type to another.
         * It accepts one argument and produces a result
         * */
        Function<Integer,String> converter = (num)-> Integer.toString(num);
        System.out.println("length of 26: " + converter.apply(26).length());

        /**
         *Supplier supplies a value. It produces a result of a given type.
         *Unlike Functions, Suppliers do not accept arguments but they do return a result.
         */
        Supplier<String> s  = ()-> "Java is fun";
        System.out.println(s.get());

        /**
         * BinaryOperator interface takes two arguments and returns one.
         */
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("add 10 + 25: " + add.apply(10, 25));

        /**
         * Unary Operatorinterface takes a single argument and returns a single value
         */
        UnaryOperator<String> str  = (msg)-> msg.toUpperCase();
        System.out.println(str.apply("This is my message in upper case"));

    }
}
