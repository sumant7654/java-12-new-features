package dev.sumantakumar.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingInStream {
    public static void main(String[] args) {
        Double mean = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(
                        Collectors.teeing(
                                Collectors.summingDouble(x -> x),
                                Collectors.counting(),
                                (sum, count) -> sum / count
                        )
                );
        System.out.println("Mean: " + mean);

    }
}
