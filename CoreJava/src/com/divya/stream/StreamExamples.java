package com.divya.stream;

import java.util.stream.Stream;

public class StreamExamples {
    static public void main(String... args) {
        //Generate finite Stream
        try {
           // Stream<Integer> finiteStream = Stream.iterate(1, n -> n < 100, n -> n + 2);
            //  finiteStream.forEach(v -> System.out.println(v));
            // System.out.println("count is"+finiteStream.count());
            //System.out.println("min is-"+finiteStream.min((i1,i2)->i1-i2).get());
           // System.out.println("max is  " + finiteStream.max((i1, i2) -> i1 - i2).get());
           // System.out.println("count is"+finiteStream.findAny());
            //  Generating infinite Stream
            //generateInfiniteStream();

           // generateInfiniteStream2();
               generateInfiniteStream3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    public static void generateInfiniteStream() {
        Stream<Double> data = Stream.generate(Math::random);
        data.forEach(v -> System.out.println(v));


    }

    private static void generateInfiniteStream2() throws InterruptedException {
        Stream<Integer> iterdata = Stream.iterate(1, n -> n + 3);

        iterdata.forEach(v -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(v);
        });
    }

    public static void generateInfiniteStream3() {
        Stream inf = Stream.generate(() -> "Luka");
        inf.forEach(System.out::println);
    }
}
