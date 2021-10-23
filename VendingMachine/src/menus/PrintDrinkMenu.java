package menus;
import iterator.*;
import factory.*;
public class PrintDrinkMenu {

	DrinkMenu drinkMenu;


	public PrintDrinkMenu(DrinkMenu drinkMenu) {
		this.drinkMenu = drinkMenu;
	}

	public void printItem() {
		Iterator iter = drinkMenu.createIterator();
		printItem(iter);
	}

	private void printItem(Iterator iterator) {

		int counter = 1;
		System.out.println("\n\n--------Choose a drink ----------\n\n");
		while(iterator.hasNext()){
			  Drink drink = (Drink) iterator.next();

			  System.out.print(counter +")" + drink.getName() + "\t");
			  System.out.println(drink.getDescription());
			  counter++;


		}

	}
}
