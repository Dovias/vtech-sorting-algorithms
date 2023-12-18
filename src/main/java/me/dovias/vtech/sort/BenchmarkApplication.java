package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BenchmarkApplication {
	public static void main(@NotNull final String[] args) {
		BenchmarkApplication.benchmarkSorting(new InsertionSort(), 6, new File("benchmark/insertion.csv"), 8000, 16000, 32000, 64000, 128000);
		BenchmarkApplication.benchmarkSorting(new ShellSort(), 6, new File("benchmark/shell.csv"), 8000, 16000, 32000, 64000, 128000);


		BenchmarkApplication.benchmarkSorting(new InsertionSort(), 6, new File("benchmark/insertion-95.csv"), 0.95f,8000, 16000, 32000, 64000, 128000);
		BenchmarkApplication.benchmarkSorting(new ShellSort(), 6, new File("benchmark/shell-95.csv"), 0.95f,8000, 16000, 32000, 64000, 128000);
	}


	public static void benchmarkSorting(SortingAlgorithm algorithm, long iterationAmount, File outputCsvFile, int... amounts) {
		BenchmarkApplication.benchmarkSorting(algorithm, iterationAmount, outputCsvFile, 0.0f, amounts);
	}

	// not great not terrible
	public static void benchmarkSorting(SortingAlgorithm algorithm, long iterationAmount, File outputCsvFile, float sortedPercentage, int... amounts) {
		PrintWriter writer = null;
		try {
			outputCsvFile.getParentFile().mkdirs();
			outputCsvFile.createNewFile();
			writer = new PrintWriter(outputCsvFile);
		} catch (IOException exception) {
			exception.printStackTrace();
		}

		System.out.println("Test algorithm: " + algorithm.getClass().getName());
		for (int amount : amounts) {
			System.out.println(amount + " element array sort:");

			// Generate pseudo-random numbers array from specified amount as a seed for consistent results between algorithms:
			for (int seed : amounts) {
				System.out.println("Random generator seed: " + seed);
				writer.print("s = " + seed);

				List<Integer> randomList = new ArrayList<>(amount);
				// Construct
				Random random = new Random(seed);
				int sortedAmount = (int) (amount * sortedPercentage);
				for (int i = 0; i < sortedAmount; i++) {
					randomList.add(random.nextInt());
				}
				algorithm.sort(randomList);
				for (int i = 0; i < amount - sortedAmount; i++) {
					randomList.add(random.nextInt());
				}

				// Do nth iterations of sorting the same array:
				double average = 0;
				for (int j = 0; j < iterationAmount; j++) {
					List<Integer> iterationList = new ArrayList<>(randomList);

					long start = System.currentTimeMillis();
					algorithm.sort(iterationList);
					long end = System.currentTimeMillis();

					long duration = end - start;
					average += duration;

					System.out.println("Iteration " + (j + 1) + ": " + duration + " ms.");
					writer.print(";" + duration);
				}
				average /= iterationAmount;
				System.out.println("Iteration average: " + average + " ms.");
				writer.print(";" + average + "\n");
			}
		}

		writer.flush();
		writer.close();
	}
}
