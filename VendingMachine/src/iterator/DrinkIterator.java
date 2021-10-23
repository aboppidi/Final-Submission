package iterator;

import factory.*;
import java.util.*;
public class DrinkIterator implements Iterator {
	List<Drink> drinks;
	int position = 0;


	public DrinkIterator(List<Drink> drinks) {
		this.drinks = drinks;
	}

	public Drink next() {
		Drink drink = drinks.get(position);
		position = position + 1;
		return drink;

	}
	public boolean hasNext() {

		if(position >= drinks.size()) {
			return false;
		}
		else {
			return true;
		}
	}

}
