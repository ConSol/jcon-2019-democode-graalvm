package de.consol.dus.graal.numbercrunching;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

public abstract class AbstractNative {

  private static final int WARMUPS = 10;
  private static final int ITERATIONS = 10;
  public abstract void execute();

  public void benchmark() {
    System.out.println("WARMUP");
    final ArrayList<Double> times = new ArrayList<>();
    for (int iteration = 0; iteration < WARMUPS; ++iteration) {
      final long start = System.nanoTime();
      execute();
      final long time = System.nanoTime() - start;
      final double inSeconds = time / 1_000_000_000d;
      System.out.printf("Iteration %d: %f s/op%n", iteration + 1, inSeconds);
    }
    System.out.println("TEST");
    for (int iteration = 0; iteration < ITERATIONS; ++iteration) {
      final long start = System.nanoTime();
      execute();
      final long time = System.nanoTime() - start;
      final double inSeconds = time / 1_000_000_000d;
      times.add(inSeconds);
      System.out.printf("Iteration %d: %f s/op%n", iteration + 1, inSeconds);
    }

    final DoubleSummaryStatistics statistics = times.stream()
        .mapToDouble(Double::valueOf)
        .summaryStatistics();

    System.out.printf("Avg: %f%n", statistics.getAverage());
  }
}