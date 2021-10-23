package menus;
import java.util.*;
import factory.*;
import iterator.Iterator;
import iterator.DrinkIterator;
public class DrinkMenu implements VendingMenu{

	List<Drink> drinkMenu;
	public DrinkMenu() {
		drinkMenu = new ArrayList<Drink>();
		drinkMenu.add(new Coke());
		drinkMenu.add(new Pepsi());
		drinkMenu.add(new Lemonade());
		drinkMenu.add(new MountainDew());
		drinkMenu.add(new EnergyDrink());

	}
	public Iterator createIterator() {
		return new DrinkIterator(drinkMenu);
	}
	public Drink getDrink(int position) {
		return drinkMenu.get(position);
	}
}



