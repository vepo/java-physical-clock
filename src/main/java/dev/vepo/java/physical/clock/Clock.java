package dev.vepo.java.physical.clock;

import java.time.Duration;
import java.time.Instant;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()));
        System.out.println(Instant.ofEpochMilli(Duration.ofNanos(System.nanoTime()).toMillis()));
        Thread.sleep(5_000);
        System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()));
        System.out.println(Instant.ofEpochMilli(Duration.ofNanos(System.nanoTime()).toMillis()));
    }
}