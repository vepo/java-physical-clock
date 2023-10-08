package dev.vepo.java.physical.clock;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import org.apache.commons.lang3.time.DurationFormatUtils;

public class Clock {
    public static void main(String[] args) throws InterruptedException {

        // Checking if System.nanoTime() and System.currentTimeMillis() are updated
        System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()));
        System.out.println(Instant.ofEpochMilli(Duration.ofNanos(System.nanoTime()).toMillis()));
        Thread.sleep(5_000);
        System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()));
        System.out.println(Instant.ofEpochMilli(Duration.ofNanos(System.nanoTime()).toMillis()));

        Random rnd = new SecureRandom();
        long start = System.nanoTime();
        for (int i = 0; i < 1_000; ++i) {
            Thread.sleep(rnd.nextInt(5));
        }
        System.out.println("It took: " + DurationFormatUtils.formatDuration(Duration.ofNanos(System.nanoTime() - start).toMillis(), "HH:mm:ss.SSS", true));
    }
}