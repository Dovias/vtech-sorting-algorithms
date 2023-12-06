package me.dovias.vtech.sort;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		// Application code!

		SortingAlgorithm insertion = new InsertionSort();

		List<Integer> insertionIntegers = new ArrayList<>(10);
		insertionIntegers.add(5);
		insertionIntegers.add(10);
		insertionIntegers.add(3);
		insertionIntegers.add(7);
		System.out.println("Insertion sort integers before sort: " + insertionIntegers);

		insertion.sort(insertionIntegers);
		System.out.println("Insertion sort integers after sort: " + insertionIntegers);


		SortingAlgorithm shell = new ShellSort();

		List<Integer> shellIntegers = new ArrayList<>(10);
		shellIntegers.add(5);
		shellIntegers.add(10);
		shellIntegers.add(3);
		shellIntegers.add(7);
		System.out.println("Shell sort integers before sort: " + shellIntegers);

		shell.sort(shellIntegers);
		System.out.println("Shell sort integers after sort: " + insertionIntegers);
	}
}
