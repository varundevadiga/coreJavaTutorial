package programming;

import java.util.Arrays;
import java.util.List;

public class FP02_Imperative {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(addNumbersFromListImperative(numberList));
    }

    private static int addNumbersFromListImperative(List<Integer> numberList) {
        int sum=0;
        for(int number : numberList) {
            sum += number;
        }
        return sum;
    }
}
