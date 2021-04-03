package allprogram.Java1_8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsVsParallelStream {
    public static void main(String[] args) {
        String[] s = new String[]{"1","2","3","4","5","6"};
        run(Arrays.stream(s).sequential());
        run(Arrays.stream(s).parallel());
    }

    private static void run(Stream<String> stream) {

            stream.forEach(s -> {
                        System.out.println("Thread : "+Thread.currentThread().getName()+" Value: "+s);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        );
    }
}
