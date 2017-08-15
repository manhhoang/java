package com.jd.java.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) throws Exception {
        CompletableFuture futureCount = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        // Simulate long running task
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                    return 10;
                });

        futureCount.get();
    }
}
