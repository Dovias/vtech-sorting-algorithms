package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class InsertionSort implements SortingAlgorithm {
	@Override
	public <T> void sort(@NotNull final List<T> list, @NotNull final Comparator<T> comparator) {
		for (int i = 1; i < list.size(); i++) {
			T a = list.get(i);

			int j = i - 1;
			while (j >= 0) {
				T b = list.get(j);
				if (comparator.compare(a, b) >= 0) {
					break;
				}

				list.set(j + 1, b);
				j--;
			}

			list.set(j + 1, a);
		}
	}
}
