package programming;

import java.util.List;

public class FP01_Imperative {
    public static void main(String[] args) {
        var numbers = List.of(1,2,4,5,6,7,8);
        //printAllNumbersInAListStructured(numbers);
        printAllEvenNumbersInAListStructured(numbers);
    }

    private static void printAllNumbersInAListStructured(List<Integer> integers) {
        for(int integer : integers){
            System.out.println(integer);
        }
    }

    private static void printAllEvenNumbersInAListStructured(List<Integer> integers) {
        for(int integer : integers){
            if (integer % 2 ==0) {
                System.out.println(integer);
            }
        }
    }
}