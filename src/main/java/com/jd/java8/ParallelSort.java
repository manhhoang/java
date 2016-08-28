package com.jd.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelSort {

  public static void main(String[] args) {
    int max = 1000000;
    List<String> values = new ArrayList<>(max);
    for (int i = 0; i < max; i++) {
      UUID uuid = UUID.randomUUID();
      values.add(uuid.toString());
    }

    long t0 = System.nanoTime();

    long count = values.parallelStream().sorted().count();
    System.out.println(count);

    long t1 = System.nanoTime();

    long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
    System.out.println(String.format("parallel sort took: %d ms", millis));

    // parallel sort took: 472 ms
    // parallel streams are performed concurrent on multiple threads
  }

}
