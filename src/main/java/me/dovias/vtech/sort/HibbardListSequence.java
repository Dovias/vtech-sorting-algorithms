package me.dovias.vtech.sort;

public class HibbardListSequence implements ListSequence {
	@Override
	public int getNumber(final int index) {
		return (int)(Math.pow(2, index) - 1);
	}

	@Override
	public int getMaxIndex(final int length) {
		int index = 0;
		int gap = 0;
		while (gap < length) {
			gap = this.getNumber(++index);
		}

		return index;
	}
}
