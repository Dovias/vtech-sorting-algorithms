package me.dovias.vtech.sort;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		// Application code!

		SortingAlgorithm insertion = new InsertionSort();

		List<Integer> integers = new ArrayList<>(10);
		integers.add(5);
		integers.add(10);
		integers.add(3);
		integers.add(7);
		System.out.println(integers);

		insertion.sort(integers);
		System.out.println(integers);
	}
}
