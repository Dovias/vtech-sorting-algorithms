package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public interface SortingAlgorithm {
	<T extends Comparable<? super T>> void sort(@NotNull List<T> list);

	<T> void sort(@NotNull List<T> list, @NotNull Comparator<T> comparator);
}