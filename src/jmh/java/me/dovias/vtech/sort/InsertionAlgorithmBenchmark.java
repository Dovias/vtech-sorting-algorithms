package me.dovias.vtech.sort;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class InsertionAlgorithmBenchmark {
	private final static SortingAlgorithm algorithm = new InsertionSort();

	private final List<Integer> list = new ArrayList<>();

	@Param({ "1000", "2001", "4030", "16500", "37003" })
	private Integer elementAmount;

	@Setup
	public void setup() {
		ThreadLocalRandom random = ThreadLocalRandom.current();
		for (int element = 0; element < elementAmount; element++) {
			list.add(random.nextInt());
		}
	}

	@Benchmark
	@Measurement(iterations = 6)
	@Timeout(time = 1)
	public void sort() {
		algorithm.sort(list);
	}
}
