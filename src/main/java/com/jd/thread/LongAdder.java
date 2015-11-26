package com.jd.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class LongAdder {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    IntStream.range(0, 1000).forEach(i -> executor.submit(adder::increment));

    stop(executor);

    System.out.println(adder.sumThenReset()); // => 1000

  }

}
