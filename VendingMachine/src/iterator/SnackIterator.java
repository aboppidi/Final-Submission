package iterator;

import java.util.*;

import factory.*;

public class SnackIterator implements Iterator  {
	List<Snack> snacks;
	int position = 0;


	public SnackIterator(List<Snack> snacks) {
		this.snacks = snacks;
	}

	public Snack next() {
		Snack snack = snacks.get(position);
		position = position + 1;
		return snack;

	}
	public boolean hasNext() {

		if(position >= snacks.size()) {
			return false;
		}
		else {
			return true;
		}
	}
}
