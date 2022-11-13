package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP_02_Functional {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);
        //System.out.println(addNumbersFromListFunctionally(numberList));
        //System.out.println(doubleAndStoreIntoList(numberList));
        System.out.println(createListWithEvenNumbers(numberList));
    }

    private static List<Integer> createListWithEvenNumbers(List<Integer> numberList) {
        return numberList.stream()
                .filter(num -> num % 2 == 0 )
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleAndStoreIntoList(List<Integer> numberList) {
        return numberList.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }

    private static int addNumbersFromListFunctionally(List<Integer> numberList) {
        return numberList.stream()
                .reduce(0, Integer::sum);
    }
}
