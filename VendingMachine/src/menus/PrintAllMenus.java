package menus;

public class PrintAllMenus {


		public void printDrinkMenu() {
			DrinkMenu drinkMenu = new DrinkMenu();
			PrintDrinkMenu printDrinkMenu = new PrintDrinkMenu(drinkMenu);
			printDrinkMenu.printItem();
		}

		public void printSnackMenu() {
			SnackMenu snackMenu = new SnackMenu();
			PrintSnackMenu printSnackMenu = new PrintSnackMenu(snackMenu);
			printSnackMenu.printItem();
		}



}
