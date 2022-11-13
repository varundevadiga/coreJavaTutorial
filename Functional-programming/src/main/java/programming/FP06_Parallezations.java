package programming;

import java.util.stream.LongStream;

public class FP06_Parallezations {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(LongStream
                .rangeClosed(1,1000000000)
                //.parallel()
                .sum());
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
