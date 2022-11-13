package programming;

import java.util.stream.IntStream;

public class FP08_Threads {
    public static void main(String[] args) {
        Runnable runnable = () -> IntStream.rangeClosed(1,100)
                    .forEach( i -> System.out.println(Thread.currentThread().getId() + ":" + i));
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
