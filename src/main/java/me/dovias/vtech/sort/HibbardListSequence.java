package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HibbardListSequence implements ListSequence {
	@Override
	public int getNumber(final int index) {
		return (int)(Math.pow(2, index) - 1);
	}

	@Override
	public int getMaxIndex(@NotNull final List<?> list) {
		return (int)Math.sqrt(list.size());
	}
}
