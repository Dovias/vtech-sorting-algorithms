package me.dovias.vtech.sort;

import java.util.Comparator;

public class ComparableComparator<T extends Comparable<? super T>> implements Comparator<T> {
	@Override
	public int compare(T a, T b) {
		return a.compareTo(b);
	}
}
