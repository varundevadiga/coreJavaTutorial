package programming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP_03_functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isEven2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num % 2 == 0;
            }
        };
        Function<Integer,Integer> doubleNumber = num -> num * num;
        BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 * num2;
        BiPredicate<Integer,Integer> biPredicate = (num1,num2) -> true;
        BiConsumer<Integer,Integer> biConsumer = (num,num1) -> System.out.println(num + " " + num1);
        Function<Integer,Integer> doubleNumber2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer num) {
                return num * num;
            }
        };
        Consumer<Integer> printEvenNumbers = num -> System.out.println(num);
        Consumer<Integer> printEvenNumbers2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println(number);
            }
        };

        numbers.stream()
                .filter(isEven2)
                .map(doubleNumber2)
                .forEach(printEvenNumbers2);
    }
}
