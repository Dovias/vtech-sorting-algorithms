package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class ShellSort implements SortingAlgorithm {
	private final static ListSequence DEFAULT_SEQUENCE = new HibbardListSequence();

	@Override
	public <T> void sort(@NotNull List<T> list, @NotNull Comparator<T> comparator, float percentage) {
		this.sort(list, comparator, ShellSort.DEFAULT_SEQUENCE, percentage);
	}

	public <T> void sort(@NotNull final List<T> list, @NotNull final Comparator<T> comparator, @NotNull final ListSequence sequence, float percentage) {
		if (percentage > 1) {
			percentage = 1;
		}
		int size = (int) (list.size() * percentage);
		for (int i = sequence.getMaxIndex(size); i > 0; i--) {
			int gap = sequence.getNumber(i);
			for (int j = gap; j < size; j++) {
				T a = list.get(j);

				int k = j;
				while (k >= gap) {
					T b = list.get(k - gap);
					if (comparator.compare(a, b) >= 0) {
						break;
					}

					list.set(k, b);
					k -= gap;
				}

				list.set(k, a);
			}
		}

	}
}
