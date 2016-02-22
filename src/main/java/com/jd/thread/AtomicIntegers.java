package com.jd.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicIntegers {

  public static void main(String[] args) {
    AtomicInteger atomicInt = new AtomicInteger(0);

    ExecutorService executor = Executors.newFixedThreadPool(2);

    IntStream.range(0, 1000).forEach(i -> executor.submit(atomicInt::incrementAndGet));

    stop(executor);

    System.out.println(atomicInt.get()); // => 1000

  }

  private static void stop(ExecutorService executor) {
    executor.shutdown();
  }

}
