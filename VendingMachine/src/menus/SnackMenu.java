package menus;
import factory.*;
import java.util.*;
import iterator.Iterator;
import iterator.SnackIterator;
public class SnackMenu implements VendingMenu{

	List<Snack> snackMenu;
	public SnackMenu() {
		snackMenu = new ArrayList<Snack>();
		snackMenu.add(new Granolabar());
		snackMenu.add(new Pretzel());

	}
	public Iterator createIterator() {
		return new SnackIterator(snackMenu);
	}

	public Snack getSnack(int position) {
		return snackMenu.get(position);
	}
}
