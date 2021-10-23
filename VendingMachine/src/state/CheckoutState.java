package state;

import java.util.Scanner;

import menus.DrinkMenu;
import menus.PrintDrinkMenu;
import menus.PrintSnackMenu;
import menus.SnackMenu;

public class CheckoutState implements State {
	Machine machine;
	public CheckoutState(Machine machine) {
		this.machine =  machine;
	}
	@Override
	public void status() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n************** Smart Vending Machine ***************\n"+
		"Items in the Cart.\n");

		machine.cart.printCart();

		System.out.println("\n========================\n");
		System.out.println("What you do like to do next?\n"
				+ "1) Go Back\n"
				+ "2) CheckOut\n"
				+ "3) Main menu\n"
				+ "4) Log out\n");
		int selection = input.nextInt();

		switch(selection) {
		case 1:

			machine.setState(machine.getDrinkCartState());
			machine.status();
			break;
		case 2:
			System.out.println("Checking out. You can pick the items");
			machine.cart.empty();
			
			break;
		case 3:
			machine.setState(machine.getMainState());
			machine.status();
		default:
			System.exit(0);
		}

	}

}
