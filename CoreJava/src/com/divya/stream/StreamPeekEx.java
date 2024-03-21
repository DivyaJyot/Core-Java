package com.divya.stream;

import java.util.stream.Stream;

public class StreamPeekEx {

    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
        nameStream.peek(System.out::println);
        Stream<String> nameStream2 = Stream.of("Alice", "Bob", "Chuck","Aira");
        nameStream2.peek(String::toLowerCase)
       .sorted()
                .forEach(System.out::println);
    }

}
