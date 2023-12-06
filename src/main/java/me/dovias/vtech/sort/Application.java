package me.dovias.vtech.sort;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		// Demonstration

		SortingAlgorithm insertion = new InsertionSort();

		List<Integer> insertionIntegers = new ArrayList<>(10);
		insertionIntegers.add(1904);
		insertionIntegers.add(10);
		insertionIntegers.add(3);
		insertionIntegers.add(2003);
		insertionIntegers.add(8);
		insertionIntegers.add(-40);
		insertionIntegers.add(3);
		insertionIntegers.add(0);

		System.out.println("Insertion sort integers before sort: " + insertionIntegers);

		insertion.sort(insertionIntegers);
		System.out.println("Insertion sort integers after sort: " + insertionIntegers);


		SortingAlgorithm shell = new ShellSort();

		List<Integer> shellIntegers = new ArrayList<>(10);
		shellIntegers.add(5);
		shellIntegers.add(0);
		shellIntegers.add(3);
		shellIntegers.add(-1);
		shellIntegers.add(5);
		shellIntegers.add(10);
		shellIntegers.add(10000);
		shellIntegers.add(7);
		System.out.println("Shell sort integers before sort: " + shellIntegers);

		shell.sort(shellIntegers);
		System.out.println("Shell sort integers after sort: " + shellIntegers);
	}
}
