package menus;

import factory.*;
import iterator.Iterator;

public class PrintSnackMenu {
	SnackMenu snackMenu;


	public PrintSnackMenu(SnackMenu snackMenu) {
		this.snackMenu = snackMenu;
	}

	public void printItem() {
		Iterator iter = snackMenu.createIterator();
		printItem(iter);
	}

	private void printItem(Iterator iterator) {

		int counter = 1;
		System.out.println("\n\n--------Choose a snack ----------\n\n");
		while(iterator.hasNext()){
			  Snack snack = (Snack) iterator.next();

			  System.out.print(counter + ")" + snack.getName() + "\t");
			  System.out.println(snack.getDescription());



		}

	}
}
