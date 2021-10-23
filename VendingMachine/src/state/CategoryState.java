package state;

import java.util.Scanner;

import menus.DrinkMenu;
import menus.PrintDrinkMenu;
import menus.PrintSnackMenu;
import menus.SnackMenu;

public class CategoryState implements State{

	Machine machine;
	public CategoryState(Machine machine) {
		this.machine =  machine;
	}
	@Override
	public void status() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n************** Smart Vending Machine ***************\n"+
		"Select a Item above to add to cart.\n");

		int selection = input.nextInt();

		switch(selection) {
		case 1:
			DrinkMenu drinkMenu = new DrinkMenu();
			PrintDrinkMenu printMenu = new PrintDrinkMenu(drinkMenu);
			printMenu.printItem();
			machine.setState(machine.getDrinkCartState());
			machine.status();
			break;
		case 2:
			SnackMenu snackMenu = new SnackMenu();
			PrintSnackMenu printSnackMenu = new PrintSnackMenu(snackMenu);
			printSnackMenu.printItem();
			machine.setState(machine.getSnackCartState());
			machine.status();
			break;
//		case 3:
//			CookieMenu cookieMenu = new CookieMenu();
//			PrintCookieMenu printCookieMenu = new PrintCookieMenu(drinkMenu);
//			printCookieMenu.printItem();
//			machine.setState(machine.getCategoryState());
//			machine.status();
//			break;
		case 4:
			System.exit(0);
		}

	}

}
