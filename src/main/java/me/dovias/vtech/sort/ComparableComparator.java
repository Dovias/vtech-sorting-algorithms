package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class ComparableComparator<T extends Comparable<? super T>> implements Comparator<T> {
	@Override
	public int compare(@NotNull final T a, @NotNull final T b) {
		return a.compareTo(b);
	}
}
