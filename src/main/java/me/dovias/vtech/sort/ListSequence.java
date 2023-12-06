package me.dovias.vtech.sort;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ListSequence {
	int getNumber(int index);
	int getMaxIndex(@NotNull List<?> list);
}
