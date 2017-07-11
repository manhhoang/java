package com.jd.java_general.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class LongAdders {

  public static void main(String[] args) {
    LongAdder adder = new LongAdder();
    ExecutorService executor = Executors.newFixedThreadPool(2);

    IntStream.range(0, 1000).forEach(i -> executor.submit(adder::increment));

    stop(executor);

    System.out.println(adder.sumThenReset()); // => 1000

  }

  private static void stop(ExecutorService executor) {
    executor.shutdown();
  }

}
