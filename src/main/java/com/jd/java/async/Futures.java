package com.jd.java.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Futures {

  public static void main(String[] args) throws InterruptedException, ExecutionException,
      TimeoutException {
    ExecutorService executor = Executors.newFixedThreadPool(1);

    Future<Integer> future = executor.submit(() -> {
      try {
        TimeUnit.SECONDS.sleep(2);
        return 123;
      } catch (InterruptedException e) {
        throw new IllegalStateException("task interrupted", e);
      }
    });

    future.get(1, TimeUnit.SECONDS);

  }

}
