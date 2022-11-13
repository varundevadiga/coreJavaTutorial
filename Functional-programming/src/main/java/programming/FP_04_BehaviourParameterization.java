package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FP_04_BehaviourParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Predicate<Integer> evenPredicate = num -> num % 2 == 0;
        Predicate<Integer> oddPredicate = num -> num % 2 != 0;
//        filterNumberAndPrint(numbers, evenPredicate);
//        System.out.println("---------------------");
//        filterNumberAndPrint(numbers, oddPredicate);
//        System.out.println("multple of 3---");
//        filterNumberAndPrint(numbers, number -> number % 3 == 0);
        Function<Integer, Integer> integerIntegerFunction = num -> num * num;

//        customizeListAndPrint(numbers, integerIntegerFunction);
//        customizeListAndPrint(numbers, number -> number * number * number);
        Supplier<Integer> supplier = () -> {
            Random random = new Random(1000);
            return random.nextInt();
        };

        Supplier<String> supplier1 = String::new;

        UnaryOperator<Integer> unaryOperator = (x) -> x * 3 ;
        BinaryOperator<Integer> binaryOperator = (x , y) -> x + y;
        System.out.println(unaryOperator.apply(20));
        System.out.println(binaryOperator.apply(10,20));
        System.out.println(supplier.get());
    }

    private static List<Integer> customizeListAndPrint(List<Integer> numbers, Function<Integer, Integer> integerIntegerFunction) {
        return numbers.stream()
                .map(integerIntegerFunction)
                .collect(Collectors.toList());
    }

    //behaviou parameterization , passing function as a parameter to the function
    private static void filterNumberAndPrint(List<Integer> numbers, Predicate<Integer> evenPredicate) {
        numbers.stream()
                .filter(evenPredicate)
                .forEach(System.out::println);
    }

    BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer a, Integer b) {
            return a + b;
        }
    };

}
