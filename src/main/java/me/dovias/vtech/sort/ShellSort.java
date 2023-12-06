package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class ShellSort implements SortingAlgorithm {
	private final static ListSequence DEFAULT_SEQUENCE = new HibbardListSequence();
	@Override
	public <T> void sort(@NotNull final List<T> list, @NotNull final Comparator<T> comparator) {
		this.sort(list, comparator, ShellSort.DEFAULT_SEQUENCE);
	}

	public <T> void sort(@NotNull final List<T> list, @NotNull final Comparator<T> comparator, @NotNull final ListSequence sequence) {
		for (int i = sequence.getMaxIndex(list); i > 0; i--) {
			for (int j = sequence.getNumber(i); j < list.size(); j++) {
				T a = list.get(j);

				int k = j - i;
				while (k >= 0) {
					T b = list.get(k);
					if (comparator.compare(a, b) >= 0) {
						break;
					}

					list.set(k + i, b);
					k -= i;
				}

				list.set(k + i, a);
			}
		}

	}
}
