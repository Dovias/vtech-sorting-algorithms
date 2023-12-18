package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public interface SortingAlgorithm {
	default <T extends Comparable<? super T>> void sort(@NotNull List<T> list) {
		this.sort(list, 1);
	}

	default <T extends Comparable<? super T>> void sort(@NotNull List<T> list, float percentage) {
		this.sort(list, new ComparableComparator<>(), percentage);
	}

	<T> void sort(@NotNull List<T> list, @NotNull Comparator<T> comparator, float percentage);
}